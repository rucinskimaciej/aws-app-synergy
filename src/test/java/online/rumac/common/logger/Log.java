package online.rumac.common.logger;

public class Log {

    public static void onTerminal(String log) {
        System.out.printf("    [LOG] -- %s%n", log);
    }
}
