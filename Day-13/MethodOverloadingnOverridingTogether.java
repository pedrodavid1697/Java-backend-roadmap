class Notification {
    void send(String message) {
        System.out.println(message);
    }
}
class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println(message);
    }
    void send(String message, String emailAddress) {
        System.out.println(message + emailAddress);
    }
}

public class MethodOverloadingnOverridingTogether {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Email sending");
        EmailNotification notify = new EmailNotification();
        notify.send("How are you? mail send to: ","David");
    }
}
