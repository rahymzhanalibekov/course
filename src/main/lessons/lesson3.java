<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("HomeTaskOne");
        homeTaskOne();
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskTwo");
        homeTaskTwo();
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskThree");
        homeTaskThree();
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskFour");
        homeTaskFour();
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskFive");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = sc.nextInt();
        System.out.print("Введите значение элементов массива: ");
        int initalValue = sc.nextInt();
        int arr[] = homeTaskFive(len, initalValue);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "] = " + arr[i] + ";");
        }
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskSix");
        homeTaskSix();
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskSeven");
        System.out.print("Введите размер массива: ");
        len = sc.nextInt();
        int arr7[] = new int[len];
        for (int i = 0; i < arr7.length; i++) {
            System.out.print("Введите значание элемента массива: arr[" + (i + 1) + "] = ");
            arr7[i] = sc.nextInt();
        }
        System.out.println(homeTaskSeven(arr7));
        System.out.println(" --------------------------------");
        System.out.println("HomeTaskEight");
        System.out.print("Введите размер массива: ");
        len = sc.nextInt();
        int arr8[] = new int[len];
        for (int i = 0; i < arr8.length; i++) {
            System.out.print("Введите значание элемента массива: arr[" + (i + 1) + "] = ");
            arr8[i] = sc.nextInt();
        }
        System.out.print("Введите число: n = ");
        int n = sc.nextInt();
        homeTaskEight(arr8, -2);
    }

    public static void homeTaskOne() {
        int arr[] = {1, 1, 0, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + (i + 1) + "] = " + arr[i] + "   >>>   ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.println("arr[" + (i + 1) + "] = " + arr[i] + ";");

        }

    }

    public static void homeTaskTwo() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + (i) + "] = " + arr[i] + ";");
        }
    }

    public static void homeTaskThree() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.println("arr[" + (i) + "] = " + arr[i] + ";");
        }
    }

    public static void homeTaskFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j) arr[i][j] = 1;
                arr[i][arr.length - 1 - i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] homeTaskFive(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    public static void homeTaskSix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите значание элемента массива: arr[" + (i + 1) + "] = ");
            arr[i] = sc.nextInt();
        }
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) minValue = arr[i];
            if (maxValue < arr[i]) maxValue = arr[i];
        }
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Максимальное значение массива: " + maxValue);
    }

    public static boolean homeTaskSeven(int arr[]) {

        int halfValue = 0;
        int sumValue = 0;
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            sumValue += arr[i];
        }
        if (sumValue % 2 > 0) answer = false;
        else {
            halfValue = sumValue / 2;
            sumValue = 0;
            for (int i = 0; i < arr.length; i++) {
                sumValue += arr[i];
                if (sumValue == halfValue) {
                    answer = true;

                }
            }

        }
        return answer;
    }

    public static void homeTaskEight(int arr[], int n) {
        int tmpElement = 0;
        int tmp1 = 0;
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                tmpElement = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = tmpElement;
            }

        } else {
            for (int j = 0; j < Math.abs(n); j++) {
                tmpElement = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = tmpElement;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

=======
public class lesson3 {
    public static void main(String[] args) {
>>>>>>> origin/MyNewBranch

    }
}
