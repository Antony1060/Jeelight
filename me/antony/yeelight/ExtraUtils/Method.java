package me.antony.yeelight.ExtraUtils;

public enum Method {

    SET_CT_ABX,
    SET_RGB,
    SET_HSV,
    SET_BRIGHT,
    SET_POWER,
    TOGGLE,
    SET_DEFAULT,
    START_CF,
    STOP_CF,
    SET_SCENE,
    CRON_ADD,
    CRON_GET,
    CRON_DEL,
    SET_AJUST,
    SET_MUSIC,
    SET_NAME,
    BG_SET_RGB,
    GB_SET_HSV,
    BG_SET_CT_ABX,
    BG_START_CF,
    BG_STOP_CF,
    BG_SET_SCENE,
    BG_SET_POWER,
    BG_SET_BRIGHT,
    BG_SET_AJUST,
    BG_TOGGLE,
    DEV_TOGGLE,
    ADJUST_BRIGHT,
    ADJUST_CF,
    ADJUST_COLOR,
    BG_ADJUST_BRIGHT,
    BG_ADJUST_CT,
    BG_ADJUST_COLOR;

    public static String toString(Method method) {
        return method.toString().toLowerCase();
    }

}
