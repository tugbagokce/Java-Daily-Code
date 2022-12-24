package day07_ternary_SwitchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        //kullanicidan alinan deger
        //100 den buyukse sayiyi 2 ile carpin
        //100 e esit veya 100 den kucuk se sayiya 10 ekleyin


        int input=45;

        //if else ile

        if (input>100){
            input*=2;

        }else{
            input+=10;
        }
        System.out.println("if else ile: "+input);
        //ternary ile

        input=45;

        input=input>100 ? input*2 : input+10 ;

        System.out.println("ternary ile : "+input);

    }
}
