package P12_recursion_1;

public class P25_countHi2 {
    public int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.charAt(0) == 'x' && str.startsWith("hi", 1)) return countHi2(str.substring(3));
        if (str.startsWith("hi")) return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }

}
