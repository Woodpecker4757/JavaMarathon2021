package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivan Ivanov Ivanovich","Geography");
        Student student = new Student("Petrov Petr Petrovich");
        teacher.evaluate(student);
    }
}
