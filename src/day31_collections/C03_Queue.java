package day31_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        Queue<String>harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler);//[H,K,B,K]

        //1.indexe F ekle
        // Queue ozelliginden dolayi ekleme sona olmali araya ekleme olmaz

        System.out.println(harfler.remove());//H
        System.out.println(harfler);//[K,B,K]
        System.out.println(harfler.remove("K"));//TRUE
        System.out.println(harfler);//[B,K]

        System.out.println(harfler.element());//B
        System.out.println(harfler);//[B,K]
        System.out.println(harfler.peek());//B
        System.out.println(harfler);//[B,K]

        Queue<String>karakterler=new LinkedList<>();

        //karakterler.element();///exception
        System.out.println(karakterler.peek());//null
        System.out.println(harfler.poll());//B
        System.out.println(harfler);//[K]

        //System.out.println(karakterler.remove());//exception
        System.out.println(karakterler.poll());//null

        harfler.offer("C");
        System.out.println(harfler);//[K,C]
        //add ile offer arasindaki fark offer varsa kapasiyeti kontrol eder
        //kapasite uygunsa ekler
        //add ise kapasiteye bakmaksizin direkt ekler



    }
}
