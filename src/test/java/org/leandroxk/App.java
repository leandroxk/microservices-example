package org.leandroxk;

import java.util.List;

public class App {

    public static void main(final String... args) {
        List.of("123456789").forEach(Log::info);
        List.of("123456789").forEach((x) -> Log.info(x));
        List.of("1234567890", "2468", "13579", "1257").forEach((x) -> Log.info(x));

        final var number = 123456789;
        Log.info(new StringBuilder(String.valueOf(number)).reverse().toString());
        List.of("123456789").forEach(Log::info);
    }
}

class Log {

    public static void info(final String msg) {
        System.out.println("[INFO]: " + msg);
    }

}