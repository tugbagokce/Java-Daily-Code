package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        //verilen bir stringin palindrom olup olmadigini yazdirin
        //palindrom :duz okunusu ile tersten okunusu ayni

        String str="Bu methodlar ne guzelmis";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrom");
        }else{
            System.out.println("verilen metin palindrom degil");
        }
    }
}
