package structural.decorator;

import java.nio.file.Watchable;

public class DecoratorTest {


    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        PhoneService phoneService = new PhoneService(emailService);
        SlackService slackService = new SlackService(emailService);
        slackService.send("589655236","slack is up");
        System.out.println();
        phoneService.send("965855555","Hello");
    }
}
