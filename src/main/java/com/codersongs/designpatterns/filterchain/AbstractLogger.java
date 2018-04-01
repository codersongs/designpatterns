package com.codersongs.designpatterns.filterchain;

public abstract class AbstractLogger {
    public static final Integer DEBUG = 1;
    public static final Integer INFO = 2;
    public static final Integer ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (this.nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
