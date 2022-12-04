public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1000000;
        double payment = service.calculate(amount);
        System.out.println(payment);
    }
}
