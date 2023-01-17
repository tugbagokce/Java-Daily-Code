package day31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {

    public static void main(String[] args) {

        //set index yapisini desteklemz

        Set<String>ogrenciler=new TreeSet<>();

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler);//[Ayten,Esra,furkan]

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);//[Ahmet,Ayten,Esra,furkan]
    }
}
