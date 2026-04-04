public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String[] log = logLine.split(":");
        switch (log[0]) {
            case "[TRC]" -> { return LogLevel.TRACE; }
            case "[DBG]" -> { return LogLevel.DEBUG; }
            case "[INF]" -> { return LogLevel.INFO; }
            case "[WRN]" -> { return LogLevel.WARNING; }
            case "[ERR]" -> { return LogLevel.ERROR; }
            case "[FTL]" -> { return LogLevel.FATAL; }
            default -> { return LogLevel.UNKNOWN; }
        }
    }

    public String getOutputForShortLog() {
        LogLevel lvl = getLogLevel();
        return lvl.getTypeLog() + ":" + logLine.substring(logLine.indexOf(":") + 2);
    }
}
