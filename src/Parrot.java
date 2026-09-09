public class Parrot extends AirAnimal implements Movable, Feedable {

    public Parrot(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Squawk / Echo Words";
    }

    @Override
    public String move() {
        return "Parrot is fluttering through trees.";
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating " + food + ".");
    }
}
