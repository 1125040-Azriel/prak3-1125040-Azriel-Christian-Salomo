public abstract class LandAnimal extends Animal {
    protected int numberOfLegs;

    public LandAnimal(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String printData() {
        return super.printData() + "\n" +
               "Legs : " + numberOfLegs;
    }
}
