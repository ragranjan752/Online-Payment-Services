package OnlinePyamentSystem;

public class Main {
    static void main(String[] args) {
        User user = new User();
        Payment payment;
        payment = new UPIPayment();
        user.setName("Rag");
        user.setAccountNumber("17631");
        payment.pay(5000,user);
        payment = new CardPayment();
        user.setName("Ranjan");
        user.setAccountNumber("63100");
        payment.pay(2000,user);
        System.out.println("Platform: "+PaymentService.PLATFORM_NAME);
        System.out.println("Max limit:"+TransactionRule.MAX_LIMIT);

    }
}
