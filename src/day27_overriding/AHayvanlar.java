package day27_overriding;

public class AHayvanlar extends BKuslar {

    protected void hareke() {
        System.out.println("hareket ederler");
    }
    protected void solunum() {
        System.out.println("nefes alirlar");
    }
    protected void beslenme( ) {
        System.out.println("beslenirler");
    }
    protected void cogalma( ){
        System.out.println("cogalirlar");
    }
    protected void omur( ){
        System.out.println("yasar ve olurler");
    }

}
