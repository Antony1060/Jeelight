package me.antony.yeelight.ExtraUtils;

public class HSV {

    private int hue, sat;

    public HSV(int hue, int sat) {
        this.hue = hue;
        this.sat = sat;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }
}
