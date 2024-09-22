public class RestaurantOrderSystem {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new CreditCardProcessor();
        Notifier notifier = new EmailNotifier();

    Order order = new Order(101, "Pizza, Coke", 29.99, paymentProcessor, notifier);
    order.processOrder();

        PaymentProcessor bitcoinProcessor = new BitcoinProcessor();
        Notifier smsNotifier = new SMSNotifier();

    Order order1 = new Order(102, "Pasta, Water", 19.99, bitcoinProcessor, smsNotifier);
    order1.processOrder();

    }
}
