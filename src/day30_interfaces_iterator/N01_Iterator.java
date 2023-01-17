package day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar);

        for (Integer each:sayilar
             ) {
            each=each +3;
            System.out.println(each+" ");

        }
        System.out.println("");
        System.out.println(sayilar);

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5

        System.out.println(itr.next());//23

        System.out.println(itr.next());//2

        System.out.println(itr.next());//9

        System.out.println(itr.next());//11

        System.out.println(itr.hasNext());//false


        itr=sayilar.iterator();

        System.out.println(itr.hasNext());//true

        while (itr.hasNext()){

            System.out.println(itr.next() + " ");
        }

            itr=sayilar.iterator();
        while (itr.hasNext()) {

            Integer sayi = (Integer) itr.next();

            if (sayi > 5) {
                itr.remove();
            }
        }
        System.out.println("");
            System.out.println(sayilar);//[5,2]


        }

    }

