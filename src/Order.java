public class Order {

    private int orderId ;
    private String items;
    private double totalAmout;

    private PaymentProcessor paymentProcessor;
    private Notifier notifier;

    public Order(int orderId, String items, double totalAmout, PaymentProcessor paymentProcessor, Notifier notifier){

    this.orderId = orderId;
    this.items = items;
    this.totalAmout = totalAmout;
    this.paymentProcessor = paymentProcessor;
    this.notifier = notifier;

    }

    public void processOrder(){

        System.out.println("\nProcessing order #" + orderId);
        System.out.println("Items: " + items);
        paymentProcessor.processPayment(totalAmout);
        notifier.sendNotification("Order #" + orderId + " has been processed.");
    }

}
