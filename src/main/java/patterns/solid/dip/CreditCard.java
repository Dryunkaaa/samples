package patterns.solid.dip;

public class CreditCard implements ICreditCard {

    private String cardNumber;

    private SystemType type;

    public CreditCard(SystemType type, String cardNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public SystemType getSystemType() {
        return this.type;
    }
}
