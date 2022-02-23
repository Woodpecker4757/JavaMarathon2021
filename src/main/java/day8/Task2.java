package day8;
//2. Скопируйте класс Самолет из задания дня 6.
//        Внесите изменения в класс таким образом, чтобы следующий код выводил информацию о самолете, аналогично вызову метода info().
//
//        Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
//        System.out.println(airplane);
public class Task2 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Plane plane = new Plane("Boeng",2000,150,10000);
        System.out.println(plane);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
