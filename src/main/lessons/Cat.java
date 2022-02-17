public class Cat extends Animal {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat() {
        this.setAppetite(0);
        this.setSatiety(false);
    }

    public Cat(String name) {
        this.setName(name);
        this.setAppetite(0);
        this.setSatiety(false);
    }


    public Cat(String name, int appetite) {
        this.setName(name);
        this.setAppetite(appetite);
        this.setSatiety(false);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот плавать не умеет");
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Кот не может пробежать расстояние больше чем 200 метров");
        } else System.out.println("Кот пробежал расстояние: " + distance);
    }

    @Override
    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
        this.setSatiety(true);
        p.decreaseFood(appetite);
        }
        else System.out.println(this.name+" не хватило еды для сытости");

    }
}
