package day25_inheritance;

public class ECorolla extends DToyota {

    ECorolla() {
        System.out.println("Parametresiz corolla constracteri calisti");
    }

    ECorolla(String param1){
        super("Gri");
        System.out.println("String parametreli cons calisti.");
    }
    String model="Corolla";
    String uretimYeri="Turkiye";

    public static void main(String[] args) {

        ECorolla cor1=new ECorolla("Mavi");




    }
}
