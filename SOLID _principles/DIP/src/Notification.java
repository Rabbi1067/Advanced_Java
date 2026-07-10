public class Notification {
    private MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }
    void notifyUser(String message){
        messageService.send(message);
    }
}
