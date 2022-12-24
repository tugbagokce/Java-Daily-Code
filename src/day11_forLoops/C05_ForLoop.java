package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // soru 3- kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin
        // bitis degeri baslangic degerinde kucukse uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin iki pozitif tamsayi giriniz");

        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();

        if (bitis<baslangic){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }else{
            int toplam=0;

            for (int i = baslangic; i <=bitis ; i++) {

                toplam+=i; // tum sayilari sirasi ile toplama ekledik

            }
            System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);
        }

    }
}
