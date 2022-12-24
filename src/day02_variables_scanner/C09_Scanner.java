package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        //sayi1=10  sayi2=20
        //sayi1=10  sayi2=20

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1 giriniz");

        int sayi1 = scan.nextInt();
        System.out.println("Lutfen sayi2 giriniz");

        int sayi2 = scan.nextInt();
        System.out.println("sayi1'in degeri : " + sayi2);
        System.out.println("sayi2'in degeri : " + sayi1);

    }
}
