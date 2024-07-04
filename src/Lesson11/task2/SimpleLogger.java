package Lesson11.task2;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.printf("[%s] %s\n", LocalDateTime.now(), msg);
    }
}
