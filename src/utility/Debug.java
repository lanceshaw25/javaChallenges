package utility;

public final class Debug {
    public static boolean ENABLED = false;

    private Debug() {} // Utility class; no instances

    public static void log(String format, Object... args) {
        if (ENABLED) {
            System.out.printf(format, args);
        }
    }
}
