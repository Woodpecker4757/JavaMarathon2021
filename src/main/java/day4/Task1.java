package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (не включительно). Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//
//        Пример:
//        Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        int moreEight = 0;
        for(int element : array){
            if(element > 8){
                moreEight++;
            }
        }
        int equalOne = 0;
        for(int element2 : array){
            if(element2 == 1){
                equalOne++;
            }
        }
        int even = 0;
        for(int element3 : array){
            if(element3 % 2 == 0){
                even++;
            }
        }
        int odd = 0;
        for(int element4 : array){
            if(element4 % 2 == 1){
                odd++;
            }
        }
        int sum = 0;
        for(int element5 : array){
            sum +=element5;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println(moreEight);
        System.out.println(equalOne);
        System.out.println(even);
        System.out.println(odd);
        System.out.println(sum);
    }
}
