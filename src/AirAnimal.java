public abstract class AirAnimal extends Animal {
    protected double wingSpan;

    public AirAnimal(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    @Override
    public String printData() {
        return super.printData() + "\n" +
               "Wing Span : " + wingSpan + " meter";
    }
}
