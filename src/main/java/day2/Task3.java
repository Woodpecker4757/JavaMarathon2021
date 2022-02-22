package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//      3. Реализовать программу №2, используя цикл while.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= b){
            System.out.println("Некорректный ввод");
        }else{
            int i = a;
            while (i <= b){
                i+=1;
                if(i % 5 == 0 && i % 10 != 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
