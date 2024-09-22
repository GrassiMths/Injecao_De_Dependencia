public class BitcoinProcessor implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of: $" + amount);
    }
}
