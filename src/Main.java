public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        double interestRate = 9.99;
        int months = 12;
        double payment = service.calculate(amount);
        System.out.println(payment);
    }
}
