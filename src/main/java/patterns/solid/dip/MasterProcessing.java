package patterns.solid.dip;

public class MasterProcessing extends Processing {

    public MasterProcessing(SystemType type) {
        super(type);
    }

    @Override
    public void purchase(ICreditCard card, int amount) {
        System.out.println("Master processing...");
    }
}
