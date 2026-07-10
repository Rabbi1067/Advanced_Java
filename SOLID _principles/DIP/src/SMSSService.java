public class SMSSService implements MessageService{
    @Override
    public void send(String message) {
        IO.println("Notification: "+message);
    }
}
