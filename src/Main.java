public class Main {
    public static void main(String[] args) {
        CredcalcService service = new CredcalcService();
        int s = 1_955_000; //сумма кредита
        int n = 360; //срок, на который берется кредит, месцев
        float m = 6.5f; // годовая процентная ставка
        float pay = service.calculate(s, n, m);
        System.out.print("Ежемесячный платеж:  ");
        System.out.printf("%.2f", pay);
    }
}
