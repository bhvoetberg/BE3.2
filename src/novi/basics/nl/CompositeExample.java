package novi.basics.nl;

public class CompositeExample {

    public static void main(String[] args) {
        Car aFord = new Car("Ford", "Fiesta");
        aFord.addPart("Left Front Tyre");
        aFord.addPart("Left Back Tyre");
        aFord.addPart("Right Front Tyre");
        aFord.addPart("Right Back Tyre");

        System.out.println(aFord.toString());
        System.out.println();

        Car aRedCar = new Car("Ferrari", "F500");
        System.out.println(aRedCar.toString());

        Part aRandomPart = new Part("I should not exist");
    }