package factorymethod.notifications;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification ...");
    }
}
