public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int mes = 36;
        int amount = 1_000_000;
        double rate = 9.99 / 12 / 100;

        int payment = service.calculate(amount, rate, mes);


        System.out.println(payment);




    }
}