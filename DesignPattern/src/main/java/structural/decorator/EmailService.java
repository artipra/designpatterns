package structural.decorator;
// step 2 concrete product classes
public class EmailService implements Communicator{


    @Override
    public void send(String target, String message) {
        System.out.println("send email !!!!!!!!!!!!!");
    }
}
