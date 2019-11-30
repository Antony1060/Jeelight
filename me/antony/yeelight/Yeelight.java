package me.antony.yeelight;

import me.antony.yeelight.ExtraUtils.Effect;
import me.antony.yeelight.ExtraUtils.HSV;
import me.antony.yeelight.ExtraUtils.RGB;
import me.antony.yeelight.Handlers.*;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

public class Yeelight {

    private Socket sock;
    private String ip;
    private static Connection connection;

    public Yeelight(String ip, int port) {
        connection = new Connection(ip, port);
    }

    public String setPower(boolean state, Effect effect, int duration) {
        return setPower.run(state, effect, duration);
    }

    public String setRGB(RGB rgb, Effect effect, int duration) {
        return setRGB.run(rgb.getIntValue(), effect, duration);
    }

    public String setHSV(HSV hsv, Effect effect, int duration) {
        return setHSV.run(hsv.getHue(), hsv.getSat(), effect, duration);
    }

    public String setCT(int ct, Effect effect, int duration) {
        return setCT.run(ct, effect, duration);
    }

    public String toggle() {
        return me.antony.yeelight.Handlers.toggle.run();
    }

    public String setName(String name) {
        return setName.run(name);
    }

    public String setDefault() {
        return setDefault.run();
    }

    public static List<Yeelight> discover() throws IOException {
        /* create byte arrays to hold our send and response data */
        byte[] sendData;
        byte[] receiveData = new byte[65535];

        /* our M-SEARCH data as a byte array */
        String MSEARCH = "M-SEARCH * HTTP/1.1\nHost: 239.255.255.250:1900\nMan: \"ssdp:discover\"\nST: wifi_bulb\n";
        sendData = MSEARCH.getBytes();

        /* create a packet from our data destined for 239.255.255.250:1900 */
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("239.255.255.250"), 1982);

        /* send packet to the socket we're creating */
        DatagramSocket clientSocket = new DatagramSocket(1982);
        clientSocket.send(sendPacket);

        /* recieve response and store in our receivePacket */
        System.out.println("ok");
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        System.out.println("ok");
        clientSocket.receive(receivePacket);
        System.out.println("ok");

        /* get the response as a string */
        String response = new String(receivePacket.getData());
        System.out.println("ok");

        /* print the response */
        System.out.println(response);

        /* close the socket */
        clientSocket.close();

        return null;
    }

    public static Connection getConnection() {
        return connection;
    }
}
