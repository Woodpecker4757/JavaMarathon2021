package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//        2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя цикл for each вывести в консоль:
//        наибольший элемент массива
//        наименьший элемент массива
//        количество элементов массива, оканчивающихся на 0
//        сумму элементов массива, оканчивающихся на 0
//
//        Использовать сортировку запрещено.
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        for(int element : array){
            if(element > max){
                max = element;
            }
        }
        int min = 10000;
        for(int element : array){
            if(element < min){
                min = element;
            }
        }
        int zeroEnd = 0;
        for(int element : array){
            if(element % 10 == 0){
                zeroEnd++;
            }
        }
        int zeroSum = 0;
        for(int element : array){
            if(element % 10 == 0){
                zeroSum += element;
            }
        }
        System.out.println(array.length);
        System.out.println(max);
        System.out.println(min);
        System.out.println(zeroEnd);
        System.out.println(zeroSum);
    }
}
