package day08_stringManipulation;

import java.util.Locale;

public class C02_touppercase {
    public static void main(String[] args) {
         String str = "JAVA CANDIR";

        System.out.println(str.toUpperCase());// java candir

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        str="sevgi insani hayata baglar";

        System.out.println(str.toUpperCase());//SEVGI INSANI HAYATA BAGLAR

        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);// SEVGI INSANI HAYATA BAGLAR
    }
}
