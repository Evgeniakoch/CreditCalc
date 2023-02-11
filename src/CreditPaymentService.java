public class CreditPaymentService {

    public int calculate(int amount, double rate, int mes) {

        double a = 1 + rate;
        float factor;
        factor = (float) Math.pow(a, mes);

        int payment = (int) (amount * ((rate * factor) / (factor - 1)));


        return payment;

    }


}
