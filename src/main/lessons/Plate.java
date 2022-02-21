public class Plate {
    private int food;

    public Plate() {
    }

    public Plate(int food) {
        this.setFood(food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food < n) {
            setFood(0);

        } else food -= n;
    }

    public void appendFood(int n) {
        if (n > 0) {
            food += n;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
