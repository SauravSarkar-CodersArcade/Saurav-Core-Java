package OOPs.theSealedKeyword;

// Java 17+ required for sealed classes
sealed interface PaymentMethod permits CardPayment, UPIPayment, WalletPayment {
    String getDetails();
}

final class CardPayment implements PaymentMethod {
    private final String cardNumber;
    private final String cardType;

    public CardPayment(String cardNumber, String cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    @Override
    public String getDetails() {
        return "Card Type: " + cardType + ", Card No: ****" + cardNumber.substring(cardNumber.length() - 4);
    }
}

final class UPIPayment implements PaymentMethod {
    private final String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public String getDetails() {
        return "UPI ID: " + upiId;
    }
}

final class WalletPayment implements PaymentMethod {
    private final String walletName;

    public WalletPayment(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public String getDetails() {
        return "Wallet: " + walletName;
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod p1 = new CardPayment("1234567812345678", "VISA");
        PaymentMethod p2 = new UPIPayment("saurav@okaxis");
        PaymentMethod p3 = new WalletPayment("Paytm");

        process(p1);
        process(p2);
        process(p3);
    }

    public static void process(PaymentMethod payment) {
        switch (payment) {
            case CardPayment c -> System.out.println("Processing " + c.getDetails());
            case UPIPayment u -> System.out.println("Processing " + u.getDetails());
            case WalletPayment w -> System.out.println("Processing " + w.getDetails());
        }
    }
}
