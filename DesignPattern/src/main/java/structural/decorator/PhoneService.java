package structural.decorator;

public class PhoneService extends CommunicatorDecorator{


    public PhoneService(Communicator communicator){
        super(communicator);
    }

    @Override
    public void send(String phone, String message) {
     communicator.send(phone,message);
     sendPhoneNotification(phone,message);
    }

    private void sendPhoneNotification(String phone, String message) {
        System.out.println("sending phone notification !!!!!!!!!!!");
    }
}
