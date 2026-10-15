interface NotificationService {
    void sendNotification(String message);
}
abstract class Notification2 {
    String recipient;
    Notification2(String recipient) {
        this.recipient = recipient;
    }
}
class EmailNotification2 extends Notification2 implements NotificationService {
    EmailNotification2(String recipient) {
        super(recipient);
    }
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Email to "+recipient+": "+message);
    }
}
class SmsNotification extends Notification2 implements NotificationService {
    SmsNotification(String recipient) {
        super(recipient);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS to "+recipient+": "+message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationService[] notifications = { new EmailNotification2("david@example.com"), new SmsNotification("9876543210")};
        String message = "Your account has been updated";
        for (int i=0; i<notifications.length; i++) {
            notifications[i].sendNotification(message);
        }
    }
}
