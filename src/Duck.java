public class Duck extends AirAnimal implements Movable, Feedable {

    public Duck(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Quack Quack";
    }

    @Override
    public String move() {
        return "Duck is flying and paddling.";
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating " + food + ".");
    }
}
