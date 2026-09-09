public class Shark extends SeaAnimal implements Movable, Feedable {

    public Shark(String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Silent Splash";
    }

    @Override
    public String move() {
        return "Shark is gliding through the deep ocean.";
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating " + food + ".");
    }
}
