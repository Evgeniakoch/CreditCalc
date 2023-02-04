public class CreditPaymentService {

    public int calculate(int amount, double rate, double factor) {
        int payment = (int) (amount * ((rate * factor) / (factor - 1)));


        return payment;

    }



}
