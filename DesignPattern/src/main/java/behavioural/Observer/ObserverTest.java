package behavioural.Observer;

public class ObserverTest {


    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin(100.00);
        BitcoinManager observerable = new BitcoinManager(bitcoin);
        observerable.addConsumer(new EmailConsumer());
        observerable.addConsumer(new SmsConsumer());
        observerable.publish(100.00);
    }
}
