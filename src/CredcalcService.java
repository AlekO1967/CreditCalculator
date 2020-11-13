public class CredcalcService {

    public float calculate(int s, int n, float m) {
        float i = m / 100 / 12; //ежемесячная процентная ставка
        float p = (1 + i);
        float r = (float) Math.pow(p, n); //возведение в степень
        float k = i + (i / (r - 1));
        float pay = s * k;
        return pay;
    }
}
