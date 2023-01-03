package day28_exceptions;

import java.util.Scanner;

public class C08_IIIegalArgumentExceptions {

    public static void main(String[] args) throws IllegalAccessException {

        //kullanicidan yasina girmesini isteyin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0){
         throw new IllegalAccessException();
        }else {
            System.out.println("yasiniz kaydedildi");
        }
    }
}
