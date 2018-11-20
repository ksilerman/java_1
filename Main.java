package java_1;

public class Main {

    public static void main(String[] args) {
   // byte bt, short sh, int , long, float, double, char, boolean;
	int a = 2;
    int b = 4;
    int c = 8;
    int d = 16;
	System.out.println("a * (b + (c / d)) =" + task1(a, b, c, d)); //результат 8


    }

    public static int task1 (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

}
