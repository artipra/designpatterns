package behavioural.Observer;

public class EmailConsumer implements Consumer{

    @Override
    public void consume(Double price) {
        System.out.println("sending email!!!!!!");
    }
}
