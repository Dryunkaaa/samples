package patterns.gof.proxy;

public class Server implements IServer {

    @Override
    public void connect(Client client) {
        System.out.println("Client was connected successfully!");
    }
}
