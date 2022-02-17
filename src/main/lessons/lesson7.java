public class lesson7 {
    public static void main(String[] args) {
        System.out.println("Home task One");
        homeTask_1_3();
        homeTask_4_6();
    }

    public static void homeTask_1_3() {
        Cat cat = new Cat("Кот", 500);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }

    public static void homeTask_4_6() {
        Cat[] cat = new Cat[20];
        Plate plate = new Plate(100);
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Кот" + (i + 1), 5);

            if (plate.getFood() < cat[i].getAppetite()) {
                plate.appendFood(cat[i].getAppetite() - plate.getFood());
            }
            System.out.print("Остаток еды до кормления: ");
            plate.info();
            cat[i].eat(plate);
            if (cat[i].isSatiety()) {
                System.out.println(cat[i].getName() + " сытый");
            } else
                System.out.println(cat[i].getName() + " голоден");
            System.out.print("Остаток еды после кормления: ");
            plate.info();
        }
    }
}
