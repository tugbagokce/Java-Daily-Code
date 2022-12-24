package day11_forLoops;

public class C02_forLoop {
    public static void main(String[] args) {

        //input olarak verilen bir stringde
        //indexi tek sayi olanlari kucuk harfle
        //indexi cift sayi olanlari buyuk harflke yazdirin
        //ornek:Java output : JaVa


        String input="Java candir, Selenium heyecandir";

        for (int i = 0; i < input.length() ; i++) {

            System.out.print(i%2==0  //index cif mi?
                             ? input.substring(i,i+1).toUpperCase() //index cift ise
                             : input.substring(i,i+1).toLowerCase() // index cigt degilse
                             );

        }



    }
}
