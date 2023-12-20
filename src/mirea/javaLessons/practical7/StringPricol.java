package mirea.javaLessons.practical7;

public interface StringPricol {
    public static int StringLength(String str) {
        return str.length();
    }

    public static String StringShake(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res += str.charAt(i);
        }
        return res;
    }

    public static String StringInvers(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
