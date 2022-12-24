package day06_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>='A' && karakter<='Z'){
            System.out.println("girilen harf buyuk harf");

        }else {
            System.out.println("girilen karakter buyuk harf degil");
        }




    }
}
