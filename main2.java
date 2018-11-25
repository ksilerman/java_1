/*
Java. level 1. Lesson 2. Example of homework
autor Rudenko Alexander
version date 25/11/2018
*/

package java_2;

import java.util.Arrays;

public class Main {

       public static void main(String[] args) {

        System.out.println("invertArray: " + Arrays.toString(invertArray()));
        System.out.println("fillArray: " + Arrays.toString(fillArray()));
        System.out.println("changeArray: " + Arrays.toString(changeArray()));
        System.out.println("MinMax: " + Arrays.toString(MinMax()));

        }

    public static int[] invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
                else {
                arr[i] = 1;
                }
            }
        return arr;
        }

    public static int[] fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
           arr[i] = (i + i) + 1 ; // не знаю как расчитать эту последовательность!!!
        }
        return arr;
    }

    public static int[] changeArray() {
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        return w;
    }

    public static int[] MinMax() {
        int min = 0;
        int max = 0;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1 };
        min = arr[0];
        max = min;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] res = new int[2];
        res[0] = min;
        res[1] = max;
        return res;
    }

}


