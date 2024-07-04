package Lesson11.task2;

public class Main {
    public static void main(String[] args) {

        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("SimpleLog1");
        simpleLogger.log("SimpleLog2");

        smartLogger.log("SmartInfo1");
        smartLogger.log("SmartInfo2");
        smartLogger.log("FatalError");

    }

}
