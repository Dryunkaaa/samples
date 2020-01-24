package patterns.solid.dip;

public class AEProcessing extends Processing {

    public AEProcessing(SystemType type) {
        super(type);
    }

    @Override
    public void purchase(ICreditCard card, int amount) {
        System.out.println("AE processing...");
    }
}
