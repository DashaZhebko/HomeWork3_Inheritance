public class Animals {
    protected String name;

    static int counter = 0;

    public Animals(String name) {
        counter++;
        this.name = name;
    }

    public void swim(int obstacleLength) {
        System.out.println("Animal can swim");
    }

    public void run(int obstacleLength) {
        System.out.println("Animal can run");
    }
}
