package behavioural.Observer;

public class SmsConsumer implements Consumer{

    @Override
    public void consume(Double price) {
        System.out.println("sending sms!!!!!!");
    }
}
