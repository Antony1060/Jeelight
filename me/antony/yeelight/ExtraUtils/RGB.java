package me.antony.yeelight.ExtraUtils;

public class RGB {

    private int red, green, blue, intValue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getIntValue() {
        intValue = red;
        intValue = intValue << 8;
        intValue |= green;
        intValue = intValue << 8;
        intValue |= blue;
        return intValue;
    }
}
