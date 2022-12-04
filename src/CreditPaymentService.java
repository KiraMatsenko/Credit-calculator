public class CreditPaymentService {

    public double calculate(int cost) {
        int months = 12;
        double interestRate = 9.99;
        return cost * (interestRate / (1 + interestRate) - months - 1);
    }
}
