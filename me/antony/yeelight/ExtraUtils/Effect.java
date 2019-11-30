package me.antony.yeelight.ExtraUtils;

public enum Effect {

    SMOOTH,
    SUDDEN;

    public static String toString(Effect effect) {
        return effect.toString().toLowerCase();
    }

}
