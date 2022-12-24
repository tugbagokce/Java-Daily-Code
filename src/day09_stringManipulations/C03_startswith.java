package day09_stringManipulations;

public class C03_startswith {
    public static void main(String[] args) {

        String str= "Java mutluluktur";

        System.out.println(str.startsWith("Java"));//t
        System.out.println(str.startsWith("j"));//f
        System.out.println(str.startsWith("Java mutluluktur "));//t
        System.out.println(str.startsWith(""));//t
        System.out.println(str.contains("mutlu"));//t
        System.out.println(str.startsWith("mutlu"));//f

        System.out.println(str.startsWith("mutlu",5));//true

        System.out.println(str.startsWith("v",2)); // true






    }
}
