package patterns.solid.dip;

public class Processing {

    private SystemType type;

    public Processing(SystemType type) {
        this.type = type;
    }

    public void purchase(ICreditCard card, int amount){
        switch (type){
            case VISA:
                new VisaProcessing(type).purchase(card,amount);
                break;
            case MASTER:
                new MasterProcessing(type).purchase(card,amount);
                break;
            case AE:
                new AEProcessing(type).purchase(card,amount);
                break;
            default: new VisaProcessing(type).purchase(card,amount);
        }

    }
}
