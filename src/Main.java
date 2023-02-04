public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int mes = 36;
        int amount = 1_000_000;
        double rate = 9.99 / 12 / 100;
        double a;
        a = 1 + rate;
        float factor;
        factor = (float) Math.pow(a, mes);

        int payment = service.calculate(amount, rate, factor);


        System.out.println(payment);




    }
}