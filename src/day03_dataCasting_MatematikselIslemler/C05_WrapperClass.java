package day03_dataCasting_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

    String str2="123";
    String str3="354";

    int str2Int= Integer.parseInt(str2);//123
    int str3Int= Integer.parseInt(str3);//354

        System.out.println(str2Int+str3Int);

        char krk1='$';

        System.out.println(Character.isDigit(krk1));//false
        System.out.println(Character.isLetter(krk1));//false
        System.out.println(Character.isAlphabetic(krk1));//F


    }
}
