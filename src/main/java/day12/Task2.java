package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        int fs = 0;
        int fe = 30;
        int ss = 300;
        int se = 350;
        boolean fwas = true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = fs; i <= se;i++){
            arrayList.add(i);
            if(i == fe && fwas){
                i=ss;
                arrayList.add(i);
                fwas = false;
            }
        }
        System.out.println(arrayList);
    }
}
