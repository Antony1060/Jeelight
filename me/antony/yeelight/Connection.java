package me.antony.yeelight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Connection {

    Socket sock;
    PrintWriter out;
    BufferedReader in;
    String ip;
    int port;

    public Connection(String ip, int port) {
        connect(ip, port);
    }

    private void connect(String ip, int port) {
        try {
            sock = new Socket(ip, port);
            out = new PrintWriter(sock.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            this.ip = ip;
            this.port = port;
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    public Socket getSocket() {
        return sock;
    }

    public String send(String data) {
        out.println(data);
        try {
            String response = in.readLine();
            return response;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void recieve() {
        return;
    }

    public void stop() {
        try {
            in.close();
            out.close();
            sock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }
}
