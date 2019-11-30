package me.antony.yeelight.Handlers;

import me.antony.yeelight.Connection;
import me.antony.yeelight.ExtraUtils.CommandBuilder;
import me.antony.yeelight.ExtraUtils.Effect;
import me.antony.yeelight.ExtraUtils.Method;
import me.antony.yeelight.Yeelight;

public class setPower {

    private static Connection connection = Yeelight.getConnection();

    public static String run(boolean state, Effect effect, int duration) {
        String data = CommandBuilder.build(Method.SET_POWER, convertBoolean(state), Effect.toString(effect), duration);
        return connection.send(data);
    }

    private static String convertBoolean(boolean bool) {
        return bool ? "on" : "off";
    }

}
