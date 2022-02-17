public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }

    public void eat() { System.out.println("Животное ест");  }

    public void run(int distance) {
        System.out.println("Животное пробежало: " + distance);
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло: " + distance);
    }
}
