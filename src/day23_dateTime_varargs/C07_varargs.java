package day23_dateTime_varargs;

public class C07_varargs {

    public static void main(String[] args) {

        //kac tane string argument yazilirsa yazilsin
        //argumentlerin en uzun olanini yazdiran bir method olusturun
        //not:en uzun kelime olarak birden fazla kelime varsa ilkini yazdirin

        enUzunuYazdir("Ilyas","berivan","murat");
    }

    private static void enUzunuYazdir(String ... kelimeler) {

        String enUzunkelime=kelimeler[0];

        for (String eachKelime: kelimeler
             ) {
            if (eachKelime.length()>enUzunkelime.length()){
                enUzunkelime=eachKelime;
            }
        }
        System.out.println(enUzunkelime);
    }
}
