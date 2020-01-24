package patterns.solid.dip;

public class VisaProcessing extends Processing {

    public VisaProcessing(SystemType type) {
        super(type);
    }

    @Override
    public void purchase(ICreditCard card, int amount) {
        System.out.println("Visa purchasing...");
    }
}
