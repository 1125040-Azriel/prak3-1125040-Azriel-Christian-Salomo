public class Fish extends SeaAnimal implements Movable, Feedable {

    public Fish(String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Blub Blub";
    }

    @Override
    public String move() {
        return "Fish is swimming rapidly.";
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating " + food + ".");
    }
}
