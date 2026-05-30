public class CreditPaymentService {
    public int calcPayment(double sum, double rate, int months) {
        double monthRate = rate / 12 / 100;
        double payment = sum * monthRate / (1 - Math.pow(1 + monthRate, -months));
        return (int) Math.round(payment);  // округление до целых рублей
    }

}
