package patterns.singltone;

public class Main {

    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getInstance();
        System.out.println(loggerService.hashCode());
        loggerService.printLog();
        LoggerService loggerService2 = LoggerService.getInstance();
        loggerService.printLog();
        System.out.println(loggerService2.hashCode());
    }
}
