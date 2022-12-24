package day14_doWhileLoop_scope;

public class Hastane {

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelIsmi;
    String oersonelAdresi;
    String personelTel;


    public static void main(String[] args) {

        Hastane p1=new Hastane();
        p1.personelIsmi="kemal";


        Hastane p3=new Hastane();
        p3.personelTel="3123125465";


    }
}
