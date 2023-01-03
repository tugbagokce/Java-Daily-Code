package day25_inheritance;

public class DToyota extends CCar {

    DToyota(){
        System.out.println("Parametresiz toyota constracteri calisti");
    }

    DToyota(String param1){
        System.out.println("parametreli corolla cons calisti");
    }

    String marka="Toyota";
    String uretimYeri="Toyota farkli ulkelerde uretilir";
}
