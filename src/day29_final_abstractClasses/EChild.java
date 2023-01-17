package day29_final_abstractClasses;

import day25_inheritance.ECorolla;

public class EChild extends DParent {
    @Override
    public void method1() {
        System.out.println("parent classdaki mecburi override edilecek method1 i override ettik");

    }

    @Override
    public void method2() {
        System.out.println("parent classdaki mecburi override edilecek method1 i override ettik");


    /*
        Klasik inheritance ile parent child iliskisi olusturdugumuzda
        Parent class'daki tum ozellikleri otomatik olarak kazaniriz
        Ancak method'lari Override etme MECBURIYETI YOKTUR
        Ister override edip kendimize ozellestiririz,
        Istersek de parent class'daki haliyle kullaniriz
     */
    }

    public static void main(String[] args) {

        //DParent obj1 = new DParent();

        EChild chld1=new EChild();
        chld1.method1();
        chld1.method2();
        chld1.method3();

        DParent chld2=new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();
    }
}