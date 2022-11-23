public class CreditPaymentService {

    private int months;
    private double interestRate;
    public double calculate(int cost) {
        return cost * (interestRate / (1 + interestRate) - months - 1);
    }
}
