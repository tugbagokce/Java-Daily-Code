package day11_forLoops;

public class C03_asalSayi {
    public static void main(String[] args) {

        // input olarak verilen bir tamsayinin
        //asal sayi olup olmadigini yazdirin

        int input =19;
        String sonuc="sayi asal";

        for (int i = 2; i <input ; i++) {

            if (input%i==0){
                sonuc="sayi asal degil";
                System.out.println("sayi asal degil");
                break;
                // java bir loopun icinde "break" gorurse
                // o loop u bititiri


            }

        }
        System.out.println(sonuc);

    }
}
