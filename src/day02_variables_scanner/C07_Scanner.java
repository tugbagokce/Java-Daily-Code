package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi yaziniz");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        System.out.println("Isminiz : " + isim + "\nsoyisminiz : " + soyisim + "\nyasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir.");
    }
    }
