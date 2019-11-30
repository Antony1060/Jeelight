package me.antony.yeelight.ExtraUtils;


public class CommandBuilder {

    public static String build(Method method, Object... args) {
        String params = "[";
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof String) {
                params += "\"";
            }
            if (i == args.length - 1) {
                params += String.valueOf(args[i]);
                if (args[i] instanceof String) {
                    params += "\"";
                }
            } else {
                params += String.valueOf(args[i]);
                if (args[i] instanceof String) {
                    params += "\"";
                }
                params += ", ";
            }
        }
        params += "]";
        String command = "{\"id\":1, \"method\":\"" + Method.toString(method) + "\", \"params\":" + params + "}";
        return command;
    }
}
