public class CreditPaymentService {
    public double calculate(double total, double percent, double period) {
        double power = (percent / 1200) + 1;

        double payment = total * (((percent / 1200) * (Math.pow(power, period)) / ((Math.pow(power, period) - 1))));

        return payment;
    }
}




