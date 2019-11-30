package me.antony.yeelight.Handlers;

import me.antony.yeelight.Connection;
import me.antony.yeelight.ExtraUtils.CommandBuilder;
import me.antony.yeelight.ExtraUtils.Method;
import me.antony.yeelight.Yeelight;

public class toggle {

    private static Connection connection = Yeelight.getConnection();

    public static String run() {
        String data = CommandBuilder.build(Method.TOGGLE);
        return connection.send(data);
    }

}
