package day21_staticKeyword;

import javax.sound.midi.Soundbank;

public class C03_PassbyValue {
    public static void main(String[] args) {

        int s = 20;
        System.out.println(s);//20

        //int sayi=30;
        // bir scope de tanimlanan variablenin yeniden tanimlanma imkani yoktur

        //String sayi="hasan";
        //data turunun degistirilmesi de mumkun degildir
        //cunku variablenin ismini yazdirdigimizda hangi sayi variablesini  kullanacagi mechul olur
        method1();
    }

    public static void method1(){
        method2(5);

        String s="Hasan";

        System.out.println(s.toLowerCase());//hasan
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
