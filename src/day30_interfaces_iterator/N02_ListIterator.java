package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);

        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()){
            Integer sayi=(Integer)lit.next();
            lit.set(sayi+3);

        }

        System.out.println(sayilar);
    }
}
