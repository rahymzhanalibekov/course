public class Cat extends Animal {
    public Cat() {
    }
    public Cat(String name) {
        this.name = name;
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
}
