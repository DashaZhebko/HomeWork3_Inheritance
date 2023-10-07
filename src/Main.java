public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik", 140);
        dogBobik.run();
        dogBobik.swim();

        Cat catBarsik = new Cat("Barsik", 100);
        catBarsik.swim();
        catBarsik.run();

        System.out.println("The number of created objects is: " + Animals.counter);

    }
}