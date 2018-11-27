import java.util.Scanner;
import java.util.Random;
public class java_3 {

    public static Scanner scan = new Scanner(System.in);


    public static void main (String[] args) {
int da = 1;
int net = da;
        System.out.println("Угадайте число в пределах от 0 до 10");
        Random rand = new Random();
        int x = rand.nextInt(10);
        do {
            for (int i = 0; i <= 2; i++) {
                int a = scan.nextInt();
                if (a == x) {
                    System.out.println("Угадали");
                    
                } else if (a > x) {
                    System.out.println("Число меньше");
                } else {
                    System.out.println("Число больше");
                }
            }
        }  while (net == 0);
    }
}

