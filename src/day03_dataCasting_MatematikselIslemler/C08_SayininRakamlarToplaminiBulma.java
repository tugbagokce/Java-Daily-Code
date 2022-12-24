package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanicdan 4 basamakli pozitif bir tamsayi alin
        //sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int girilenSayi=scan.nextInt();//2457

        // soru icin lazim olacakvariableleri hazirlayalim

        int rakamlarToplami =0;
        int birlerBasamagi = 0;

       //sirasiyla her bir basamagi elde edip
        //rakamlar toplamini ekleyelim

        birlerBasamagi=girilenSayi%10; // 7
        rakamlarToplami= rakamlarToplami+birlerBasamagi; // 0+7= 7
        girilenSayi=girilenSayi/10; // 245

        birlerBasamagi=girilenSayi%10; // 5
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 7 + 5 =12
        girilenSayi=girilenSayi/10; // 24

        birlerBasamagi= girilenSayi%10; // 4
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 12 + 4 =16
        girilenSayi=girilenSayi/10; // 2

        birlerBasamagi=girilenSayi%10; // 2
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 16 + 2 = 18
        girilenSayi = girilenSayi/10; // 0
        System.out.println("verilen sayinin rakamlar toplami : " + rakamlarToplami);
    }
}
