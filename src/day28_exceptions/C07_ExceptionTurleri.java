package day28_exceptions;

public class C07_ExceptionTurleri {

    public static void main(String[] args) {

        String str="25";

        //str a sayisial olarak 5 ekleyin

        System.out.println(Integer.parseInt(str)+5);

        // eger str iicinde sayi olmayan bir karakter o9lursa numberformatexception

        Object sayiObj=str;

        Integer sayiInt=(Integer)sayiObj;

        System.out.println(sayiInt);//ClassCastException

    }
}
