package day07_ternary_SwitchStatements;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //soru 2 kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenarsa "eskenar ucgen" yazdirin, degilse "eskenar ucgen degil" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        int kenar1=14;
        int kenar2=12;
        int kenar3=14;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar ucgen degil" );
    }
}
