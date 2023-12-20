package mirea.javaLessons.practical7;

public interface MathCalculable {
    final double PI = 3.1415926535;
    default double Pow(double a, double b){
        return Math.pow(a, b);
    }
    static double CompAbs(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
