package day6;
//2. Создать класс Самолет (Airplane) с полями:
//        ⦁	producer (изготовитель)
//        ⦁	year (год выпуска)
//        ⦁	length (длина)
//        ⦁	weight (вес)
//        ⦁	fuel (количество топлива в баке)
//
//        Для всех полей должны быть реализованы сеттеры, а для поля fuel еще и геттер.
//
//        Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “количество топлива в баке” установить равным 0). В конструкторе для передачи полям значений использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
//        “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
//
//        Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
//        Создать новый объект класса Самолет с произвольными данными.
//        Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза, передав разные значения. Вызвать метод info().

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("EFKO",2017, 48, 30000, 0);
        plane.setProducer("EFKO");
        plane.setYear(2017);
        plane.setLength(48);
        plane.setWeight(30000);
        plane.setFuel(0);
        plane.fillUp(456);
        plane.fillUp(228);
        Random random = new Random();
        int r = random.nextInt(10);// 0-9
        String[] producers = new String[]{"Aero","Efko","kolby","Chip and Dale","Phenomenal","Mozart","Paganini","Imagine","Zombie","Anarchy"};
        String producer = producers[r];
        int year = random.nextInt( 3030);
        int length = random.nextInt( 170);
        int weight = random.nextInt(450000);
        int fuel = random.nextInt(200);
        plane.info();
        fuel = random.nextInt(200);
        plane.fillUp(fuel);
        fuel = random.nextInt(200);
        plane.fillUp(fuel);
        plane.info();
    }
}
