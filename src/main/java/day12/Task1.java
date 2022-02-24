package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(new String("Audi"));
        arrayList.add(new String("BMW"));
        arrayList.add(new String("Lada"));
        arrayList.add(new String("Tesla"));
        arrayList.add(new String("Mercedes"));
        System.out.println(arrayList);
        int center = arrayList.size()/2;
        arrayList.add(center,"Kia");
        System.out.println(arrayList);
        arrayList.remove(0);
    }
}
