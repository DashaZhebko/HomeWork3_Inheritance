public class Cat extends Animals {

    public Cat(String name, int obstacleLength) {
        super(name, obstacleLength);
    }

    @Override
    public void run() {
        int obsLength = Math.min(200, obstacleLength);
        System.out.printf("%s ran %d m.%n",name, obsLength);
    }

    @Override
    public void swim() {
        System.out.printf("%s can't swim %n", name);
    }
}
