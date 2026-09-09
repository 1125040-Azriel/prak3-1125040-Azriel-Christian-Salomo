public class Whale extends SeaAnimal implements Movable, Feedable {

    public Whale(String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Whale Song / Click";
    }

    @Override
    public String move() {
        return "Whale is diving gracefully.";
    }

    @Override
    public void eat() {
        System.out.println("Whale is eating " + food + ".");
    }
}
