package patterns.solid.dip;

public class Terminal {

    public void purchase(ICreditCard card, int amount){
        new Processing(card.getSystemType()).purchase(card, amount);
    }
}
