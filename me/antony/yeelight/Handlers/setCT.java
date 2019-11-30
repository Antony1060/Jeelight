package me.antony.yeelight.Handlers;

import me.antony.yeelight.Connection;
import me.antony.yeelight.ExtraUtils.CommandBuilder;
import me.antony.yeelight.ExtraUtils.Effect;
import me.antony.yeelight.ExtraUtils.Method;
import me.antony.yeelight.Yeelight;

public class setCT {

    private static Connection connection = Yeelight.getConnection();

    public static String run(int ct, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_CT_ABX, ct, Effect.toString(effect), duration);
        return connection.send(data);
    }
}
