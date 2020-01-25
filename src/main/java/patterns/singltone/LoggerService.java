package patterns.singltone;

public class LoggerService {

    private static LoggerService instance;

    private LoggerService() {
    }

    public static LoggerService getInstance() {
        if (instance == null){
            instance = new LoggerService();
        }
        return instance;
    }

    public void printLog(){
        System.out.println("LOG");
    }
}
