package patterns.gof.proxy;

public class Client {

    public void connect(){
        IServer server = new Proxy();
        server.connect(this);
    }
}
