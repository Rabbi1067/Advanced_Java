public class EmailService implements MessageService{
    @Override
    public void send(String message) {
        IO.println("Email: "+message);
    }
}
