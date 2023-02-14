package net.nkremlev.exercism.java.strings;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(':') + 1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']')).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format(
                "%s (%s)",
                logLine.substring(logLine.indexOf(':') + 1).trim(),
                logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']')).toLowerCase()
        );
    }
}
