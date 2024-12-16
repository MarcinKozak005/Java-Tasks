package P06_logic_2;

public class P07_blackjack {
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return Math.max(a, b);
    }

}