public class MainCreditPaymentService {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1000000;
        double rate = 9.99;
        int months= 36;

        double result = service.calcPayment (sum, rate, months);

        System.out.println(result);

    }
}

