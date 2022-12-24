package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini alip ve girilen ismi buyuk harfle yazdiirn

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String girilenIsim=scan.nextLine();

        System.out.println(girilenIsim.toUpperCase());
    }
}
