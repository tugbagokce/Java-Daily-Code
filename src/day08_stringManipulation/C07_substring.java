package day08_stringManipulation;

import java.util.SplittableRandom;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());//karakter sayisi 19

        // metnin tam ortasindaki karakter nedir

        System.out.println(str.charAt(str.length()/2));//n

        //son karakteri yazdir

        System.out.println(str.charAt(str.length()-1));

        // bir karakteri degilde verilen string in icerdigi bir metin parcasini elde etemk istersek

        // "ogren"kelimesini yazdir

        System.out.printf(str.substring(5, 9));//ogre



    }
}
