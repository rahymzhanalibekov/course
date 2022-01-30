//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class lesson2 {
    public lesson2() {
    }

    public static void main(String[] args) {
        System.out.println("HomeTaskOne");
        System.out.println(homeTaskOne(5, 27));
        System.out.println("HomeTaskTwo");
        homeTaskTwo(-5);
        System.out.println("HomeTaskThree");
        System.out.println(homeTaskThree(-5));
        homeTaskFour("Hello World!", 5);
        System.out.println("HomeTaskFive");
        System.out.println(homeTaskFive(1983));
    }

    public static boolean homeTaskOne(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void homeTaskTwo(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

    }

    public static boolean homeTaskThree(int a) {
        return a < 0;
    }

    public static void homeTaskFour(String s, int a) {
        for(int i = 1; i <= a; ++i) {
            System.out.println(i + ". " + s);
        }

    }

    public static boolean homeTaskFive(int god) {
        if (god % 4 == 0) {
            if (god % 100 == 0) {
                return god % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
