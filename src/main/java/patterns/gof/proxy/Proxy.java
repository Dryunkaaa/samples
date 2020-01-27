package patterns.gof.proxy;

public class Proxy implements IServer {

    private Server server = new Server();

    @Override
    public void connect(Client client) {
        System.out.println("Caching...");
        server.connect(client);
    }
}
