public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может проплыть расстояние больше чем 10 метров");
        }
        else System.out.println("Собака проплыла расстояние: " + distance);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не может пробежать расстояние больше чем 500 метров");
        } else System.out.println("Собака пробежала расстояние: " + distance);
    }
}
