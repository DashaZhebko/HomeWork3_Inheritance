public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(14);
        dogBobik.swim(12);

        Cat catBarsik = new Cat("Barsik");
        catBarsik.swim(100);
        catBarsik.run(100);

        System.out.println("The number of created objects is: " + Animal.counter);

    }
}