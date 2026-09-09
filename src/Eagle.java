public class Eagle extends AirAnimal implements Movable, Feedable {

    public Eagle(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kreeee / Screech";
    }

    @Override
    public String move() {
        return "Eagle is soaring high in the sky.";
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating " + food + ".");
    }
}
