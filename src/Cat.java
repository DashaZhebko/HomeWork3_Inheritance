public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int obstacleLength) {
        int obsLength = Math.min(200, obstacleLength);
        System.out.printf("%s ran %d m.%n",name, obsLength);
    }

    @Override
    public void swim(int obstacleLength) {

        System.out.printf("%s can't swim %n", name);
    }
}
