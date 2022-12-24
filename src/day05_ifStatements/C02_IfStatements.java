package day05_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //kullanicifdan bir sayi alip
        //pozitif ise pozitif sayi,
        //100 ile 999 arasinda ise (sinirlar dahil) pozitif 3 basamakli sayi
        //3 ile bolunebiliyorsa 363 un kati
        //birler basamagi 7 ise mukemmel
        //seceneklerinden uygun olanlari yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen tam bir sayi aliniz");
        int sayi=scan.nextInt();

        //pozitif ise pozitif sayi,
        if (sayi>0){
            System.out.println("sayi pozitftir");
        }
        //100 ile 999 arasinda ise (sinirlar dahil) pozitif 3 basamakli sayi
        if (sayi>=100 && sayi<=999) {
            System.out.println("pozitif 3 basamakli sayi");
        }

        //3 ile bolunebiliyorsa 363 un kati
        if (sayi%3==0){
            System.out.println("3 un kati");

        }
        //birler basamagi 7 ise mukemmel
        if (sayi%10==7){
            System.out.println("mukemmel");
        }
    }
}
