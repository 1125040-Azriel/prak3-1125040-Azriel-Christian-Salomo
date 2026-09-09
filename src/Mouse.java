public class Mouse extends LandAnimal implements Movable, Feedable {

    public Mouse(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Cit Cit / Squeak";
    }

    @Override
    public String move() {
        return "Mouse is scurrying.";
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating " + food + ".");
    }
}
