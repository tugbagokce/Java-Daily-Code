package day22_immutableClasses;

public class C04_StringEquals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";

        String str3=new String("Java");//Java

        String a="Ja";
        String b="va";

        String str4=a+b;//Java
        String str5=a.concat(b);//Java

        String str6=str5+"";

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        System.out.println("===============");


        System.out.println(str1==str2);//t
        System.out.println(str1==str3);//f
        System.out.println(str1==str4);//f
        System.out.println(str1==str5);//f
        System.out.println(str1==str6);//f
        System.out.println(str1=="Java");//t
        System.out.println(str2=="Java");//true


    }
}
