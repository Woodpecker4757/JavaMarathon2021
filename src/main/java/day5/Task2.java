package day5;


public class Task2 {
    public static void main(String[] args) {
//        2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”. Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать). Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this. Вывести в консоль значение каждого из полей, используя get методы.
        Motorbike motorbike = new Motorbike(2010,"kawasaki","red");
        System.out.println(motorbike.getModel() + "\n" + motorbike.getYear() + "\n" + motorbike.getColor());
    }
}
