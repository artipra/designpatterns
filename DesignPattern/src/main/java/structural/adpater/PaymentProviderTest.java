package structural.adpater;

public class PaymentProviderTest {

    public static void main(String[] args) {
        PaymentPayProvider paymentProvider = new RazorPayProvider();
        System.out.println(paymentProvider.generateLink());
        paymentProvider = new CashFreePayProvider();
        System.out.println(paymentProvider.generateLink());
    }

}
