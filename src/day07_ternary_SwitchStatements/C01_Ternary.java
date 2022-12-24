package day07_ternary_SwitchStatements;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /* Kullanicidan bir tam sayi alin
        sayi rakam ise "girilen sayi rakam"
        sayi iki basamakli ise "girilen sayi iki basamakli"
        sayi 2 basamaktan buyukse "buyuk sayi" yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tamsayi giriniz");
        int girilenSayi=scan.nextInt();


        if (girilenSayi>=0 && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi>=10 && girilenSayi<=99) System.out.println("girilen sayi iki basamakli");
        else if (girilenSayi>=100) System.out.println("buyukse");


    }
}
