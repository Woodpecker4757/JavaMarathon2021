package day7;
//1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//        В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
//

public class Task1 {
    public static void main(String[] args) {
        Plane plane = new Plane("Aero", 70 ,40 ,30000 , 200);
        Plane plane10 = new Plane("Barsik", 70 ,40 ,30540 , 298);
        plane.compareAirplains(plane,plane10);
    }
}