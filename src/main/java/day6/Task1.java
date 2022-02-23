package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setModel("Tesla");
        car.setColor("red");
        car.info();
        Motorbike motorbike = new Motorbike(1980,"kawasaki","white");
        motorbike.info();
        System.out.println("year " + car.getYear() +" model " + car.getModel() + " color " + car.getColor());
        System.out.println("year " + motorbike.getYear() +" model " + motorbike.getModel() + " color " + motorbike.getColor());
        System.out.println(motorbike.yearDifference(3070));

    }
}
