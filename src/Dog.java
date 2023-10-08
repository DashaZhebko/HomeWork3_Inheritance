public class Dog extends Animals {
    public Dog(String name) {

        super(name);
    }

    @Override
    public void swim(int obstacleLength) {
        int obsLength = Math.min(10, obstacleLength);
        System.out.printf("%s swam %d m.%n",name, obsLength);
    }

    @Override
    public void run(int obstacleLength) {
        int obsLength = Math.min(500, obstacleLength);
        System.out.printf("%s ran %d m.%n",name, obsLength);
    }
}
