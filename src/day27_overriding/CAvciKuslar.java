package day27_overriding;

public class CAvciKuslar extends BKuslar
{

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1=new CAvciKuslar();

        krt1.hareket();//c ucar
        krt1.beslenme();//c et yer
        krt1.pence();// c pence
        krt1.gaga();//c sivri gga
        krt1.kanat();//b kanatli
        krt1.solunum();//b akciger ile nefes
        krt1.cogalma();//b yumurta ile cogalir

        BKuslar krt2=new CAvciKuslar();

        krt2.hareket();//c ucar
        krt2.beslenme();//c et yer
        krt2.pence();// c pence
        krt2.gaga();//c sivri gga
        krt2.kanat();//b kanatli
        krt2.solunum();//b akciger ile nefes
        krt2.cogalma();//b yumurta ile cogalir


    }
}
