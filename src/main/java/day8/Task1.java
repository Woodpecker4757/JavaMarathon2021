package day8;
//1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//        После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
//        0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//        Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.

public class Task1 {
    public static void main(String[] args) {

        String text = "";
        long before = System.currentTimeMillis();
        for(int i = 0;i <= 2000;i++){
            text += i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        System.out.println(text);
        StringBuilder sb = new StringBuilder("");
        long before2 = System.currentTimeMillis();
        for(int i = 0;i <= 2000;i++){
            sb.append(i).append(" ");
        }
        long after2 = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(after2 - before2);
    }
}
