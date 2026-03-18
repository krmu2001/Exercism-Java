public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        String s = arr[1].trim();
        return s;
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("INFO")) {
            return "info";
        } if (logLine.contains("WARNING")) {
            return "warning";
        } if (logLine.contains("ERROR")) {
            return "error";
        }
        return "";
    }

    public static String reformat(String logLine) {
        return logLine.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
