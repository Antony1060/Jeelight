package me.antony.examples;

import me.antony.yeelight.ExtraUtils.Effect;
import me.antony.yeelight.ExtraUtils.HSV;
import me.antony.yeelight.Yeelight;

import java.io.IOException;
import java.util.List;


public class Main {

    private static Yeelight yeelight = new Yeelight("192.168.5.26", 55443);

    public static void main(String args[]) {
        yeelight.setPower(true, Effect.SMOOTH, 1000);

    }
}
