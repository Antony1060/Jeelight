This project is archived for now, might come back to it later when I have time

# Jeelight

A Java library for controlling Yeelight LED smart lights.

## Installation

Download the first thing in releases

## Usage

### Connecting
```java
Yeelight light = new Yeelight("127.0.0.1" /* IP */, 55443 /* Port */);
```

### Methods
- setPower(boolean state, Effect effect, int duration)
   ```java
   light.setPower(true, Effect.SMOOTH, 2);
   ```

- toggle()
   ```java
   light.toggle();
   ```

- setRGB(RGB rgb, Effect effect, int duration)
   ```java
   light.setRGB(new RGB(255, 0, 0), Effect.SMOOTH, 2);
   ```

- setHSV(HSV hsv, Effect effect, int duration)
   ```java
   light.setHSV(new HSV(100, 100), Effect.SMOOTH, 2);
   ```

- setCT(int ct, Effect effect, int duration)
   ```java
   light.setCT(60, EFFECT.SMOOTH, 2);
   ```

- setName(String name)
   ```java
   light.setName("YeetLight");
   ```

## License
[MIT](https://choosealicense.com/licenses/mit/)
