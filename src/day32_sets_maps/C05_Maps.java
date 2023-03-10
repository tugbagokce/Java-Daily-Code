package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {

    public static void main(String[] args) {

        Map<Integer,String>ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Veli-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.size());//4

        //mapde 103 numarali ogrenci var mi
        System.out.println(ogrenciMap.containsKey(103));//true
        //ali diye bir ogrenci var mi
        System.out.println(ogrenciMap.containsValue("Ali"));//false
        System.out.println(ogrenciMap.containsValue("Veli-Can-11-H-MF"));//true

    }
}
