package day07_ternary_SwitchStatements;

public class C03_Ternary {
    public static void main(String[] args) {
        // input olarak verilen sayiyi kontrol edip
        //sayi cift ise "cift sayi"
        //degilse "tek sayi" yazdirin.

        int input=44;
        //if else ile
        if (input%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }
// ternary ile
        System.out.println();

    }
}
