public class Dog extends LandAnimal implements Movable, Feedable {

    public Dog(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Woof Woof";
    }

    @Override
    public String move() {
        return "Dog is running.";
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + food + ".");
    }
}
