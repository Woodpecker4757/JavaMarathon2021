package day7;

public class Plane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String getProducer() {
        return producer;
    }

    public Plane(String producer, int year, int length, int weight, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public int getLength() {
        return length;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return fuel;
    }
    public void fillUp(int n){
        this.fuel += n;
        System.out.println("Бак был заправлен на " + n + " литра топлива.");
    }
    public void info(){
        System.out.println("Изготовитель: " + producer +" год выпуска: " + year + " длина: " + length + " вес: " + weight + " количество топлива в баке: " + fuel);
    }

    public static void compareAirplains(Plane plane1, Plane plane2){
        if(plane1.getLength() > plane2.getLength()){
            System.out.println("Первый самолет длинее");
        }else if(plane1.getLength() < plane2.getLength()){
            System.out.println("Второй самолет длинее");
        }else {
            System.out.println("Самолеты равны");
        }
    }
}
