public class Animal {
    protected String name;

    static int counter = 0;

    public Animal(String name) {
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
