public class Animals {
    protected String name;
    protected int obstacleLength;
    static int counter = 0;

    public Animals(String name, int obstacleLength) {
        counter++;
        this.name = name;
        this.obstacleLength = obstacleLength;
    }

    public void swim() {
        System.out.println("Animal can swim");
    }

    public void run() {
        System.out.println("Animal can run");
    }
}
