package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen urun adedini giriniz");
        int urunAdedi=30;

        System.out.println("musteri kariniz var mi");
        boolean kartVarMi=true;

        System.out.println("urunuin liste fiyatini giriniz");
        double listeFiyati=12.5;

        double toplamFiyat=0;
        if (kartVarMi==true && urunAdedi>10){
            toplamFiyat=urunAdedi*listeFiyati*(80/100);
            System.out.println(toplamFiyat);
        } else if (kartVarMi==true && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyati*(85/100);
            System.out.println(toplamFiyat);

        } else if (kartVarMi==false && urunAdedi>10) {
            toplamFiyat=urunAdedi*listeFiyati*(85/100);
            System.out.println(toplamFiyat);
            
        } else if (kartVarMi==false&urunAdedi<10&& urunAdedi>0) {
            toplamFiyat=urunAdedi*listeFiyati*(90/100);
            System.out.println(toplamFiyat);
            
        }else {
            System.out.println("gecersiz giris");/////////////////////////////***//////////////////
        }

    }
}
