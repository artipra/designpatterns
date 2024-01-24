package structural.decorator;

public class SlackService extends CommunicatorDecorator{


    public SlackService(Communicator communicator){
        super(communicator);
    }

    @Override
    public void send(String phone, String message) {
     communicator.send(phone,message);
     sendSlackNotification(phone,message);
    }

    private void sendSlackNotification(String phone, String message) {
        System.out.println("sending slack notification !!!!!!!!!!!");
    }
}
