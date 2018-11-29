/*
Java. level 1. Lesson 3. Example of homework
autor Rudenko Alexander
version date 29/11/2018
*/
import java.util.Scanner;
import java.util.Random;
public class java_3 {

    public static void main(String[] args) {

        int da = 0;

        while (da == 0) {        // выполнять пока 0
            int UserNumber = 0;  // число водимое пользователем
            int sluch = 0;       // случайное число
            int i = 0;           // счетчик
            int DaN;             // выбор: продолжить или нет

            Scanner scan = new Scanner(System.in);
            System.out.println("Угадайте число в пределах от 0 до 10");
            Random rand = new Random();
            sluch = rand.nextInt(10);
            System.out.println("Введите число у вас 3 попытки");
            while (i < 3) {
                UserNumber = scan.nextInt();
                if (UserNumber == sluch) {
                    System.out.println("Угадали");
                    i = 3;
                } else if (UserNumber < sluch) {
                    System.out.println("Число больше");
                    i++;
                } else if (UserNumber > sluch) {
                    System.out.println("Число меньше");
                    i++;
                }
            }

            System.out.println("Продолжить игру? 1 - да, 0 - нет");
            DaN = scan.nextInt();
            if (DaN == 1) {
                da = 0;
            } else {
                da = 1;
            }
        }
    }
}
