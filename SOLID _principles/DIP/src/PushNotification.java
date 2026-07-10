public class PushNotification implements MessageService{
    @Override
    public void send(String message) {
        IO.println("Push notification");
    }
}
