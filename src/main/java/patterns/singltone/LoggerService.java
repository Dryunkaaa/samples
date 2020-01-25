package patterns.singltone;

public class LoggerService {

    private static LoggerService instance = new LoggerService();

    private LoggerService() {
    }

    public static LoggerService getInstance() {
        return instance;
    }

    public void printLog(){
        System.out.println("LOG");
    }
}
