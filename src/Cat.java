public class Cat extends LandAnimal implements Movable, Feedable {

    public Cat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow Meow";
    }

    @Override
    public String move() {
        return "Cat is stalking and walking softly.";
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + food + ".");
    }
}
