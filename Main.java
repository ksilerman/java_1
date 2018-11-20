package java_1;

public class Main {

    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;
        int c = 8;
        int d = 16;
        int e = -32;
        String str = "Александр";

        System.out.println("Данные переменных: " + "a=" + a + " b=" + b + " c=" + c + " d=" + d + " e= " + e);
        System.out.println("a * (b + (c / d)) = " + calculate(a, b, c, d));
        System.out.println("a+b в диапазоне от 10 до 20 ? - " + task10and20(a, b));
        System.out.println("число 'а' положительное ? - " + isPositiveOrNegative(a));
        System.out.println("число 'e' отрицательное ? - " + isNegative(e));
        System.out.println("Привет, " + Stroka(str));

    }

    public static int calculate (int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

    public static boolean task10and20 (int a, int b)
    {
       if ((a + b) >= 10 && (a + b) <= 20 )
       {
           return true;
       }
          else
       {
              return false;
       }
    }

    public static boolean isPositiveOrNegative (int a)
    {
        if ( a >= 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isNegative (int e)
    {
        if ( e < 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String Stroka (String str)
    {
        return str;
    }

}
