package Lesson11.task2;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int callNumber = 0;

    @Override
    public void log(String msg) {
        String info;
        callNumber++;
        info = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.printf("%s#%d [%s] %s\n", info, callNumber, LocalDateTime.now(), msg);
    }
}
