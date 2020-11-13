public class Main {
    public static void main(String[] args) {
        int s = 1_955_000; //сумма кредита
        int n = 240; //срок, на который берется кредит, месцев
        float m = 8.0f; // годовая процентная ставка
        float i = m / 100 / 12; //ежемесячная процентная ставка
        float p = (1 + i);
        float r = (float) Math.pow(p, n);
        float k = i + (i / (r - 1));
        float pay = s * k;
        System.out.print("Ежемесячный платеж:  ");
        System.out.printf("%.2f", pay);
    }
}
