public class CreditPaymentService {

    private double months;

    public double calculate(int cost) {
        return cost * (9.99 / (1 + 9.99) - months - 1);
    }
}
