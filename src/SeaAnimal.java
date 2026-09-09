public abstract class SeaAnimal extends Animal {
    protected double maximumDepth;

    public SeaAnimal(String name, int age, String food, double maximumDepth) {
        super(name, age, food);
        this.maximumDepth = maximumDepth;
    }

    @Override
    public String printData() {
        return super.printData() + "\n" +
               "Max Depth : " + maximumDepth + " meter";
    }
}
