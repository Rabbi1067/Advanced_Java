    //Dependency Inversion Principle (DIP)

void main() {
    PaymentProcessor paypal = new PayPalPayment();
    PaymentService service = new PaymentService(paypal);
    service.paymentProcessor(500);
    IO.println();
    MessageService email = new EmailService();
    Notification a= new Notification(email);
    a.notifyUser("welcome");
    MessageService sms = new SMSSService();
    Notification a3= new Notification(sms);
    a3.notifyUser("OTO:1234455667");
    MessageService push =  new PushNotification();
    Notification a4= new Notification(push);
    a4.notifyUser("New Message");











}
