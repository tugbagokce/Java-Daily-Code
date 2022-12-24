package day05_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // ogrenciden notunu rakam olarak alip harf olarak yazdirin
        //0-49,999 DD
        //50-64,999CC
        //65-84,999 BB
        //85-100 AA

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (0<= not && not<50){
            System.out.println("Notunuz DD kaldiniz");
    }
        if (50<= not &&  not<65){
            System.out.println("Notunuz CC gectiniz");
        }
        if (not<=65 && not<85){
            System.out.println("Notunuz BB");
        }
        if (85<=not && not <=100){
            System.out.println("Tebrikler notunuz AA");
        }

    }
}
