package patterns.solid.dip;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(SystemType.VISA, "5351361366326");
        CreditCard creditCard1 = new CreditCard(SystemType.MASTER, "61612621612");
        CreditCard creditCard2 = new CreditCard(SystemType.AE, "16126161277");

        Terminal terminal = new Terminal();
        terminal.purchase(creditCard, 1000);
        terminal.purchase(creditCard1, 10000);
        terminal.purchase(creditCard2, 1000);
    }
}
