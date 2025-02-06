package TASK3;

public class LogCommand implements Command {
    private final LogHandler handler;
    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }
    @Override
    public void execute(String message) {
        for (LogLevel level : LogLevel.values()) {
            handler.handleMessage(level, message + " (" + level + ")");
        }
    }
}
