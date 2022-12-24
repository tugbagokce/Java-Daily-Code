package day21_staticKeyword;

public class C02_PassbyValue {

    public static void main(String[] args) {
        /*
        java pass by value kullanir
        yani metodlar arasinda gonderilen variablelaerin kendilerin degil value lari
        diger methoda yollanir
         */

    int fiyat=100;
    //fiyat uzerinden %10 indirim yapip indirimli fiyati donduren bir method olusuturun

        System.out.println(indirimYap10(fiyat));//90

        System.out.println(fiyat);//100

        //eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek atama yapariz

    }

    public static int indirimYap10(int fiyat){

        fiyat=fiyat*90/100 ;

        return fiyat;

    }
}
