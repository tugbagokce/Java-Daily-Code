package day31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

       /*

 Collections objeleri bir arada tutan yapilardir
            Gercek hayattaki ihtiyaclara gore Java farkli collection yapilari olusturmustur
            Bir uygulamada hangi collection'i kullanacagimiza istedigimiz ozelliklere gore karar veririz
       collections temelde 3 ana gruba ayrilir ve 3 interface ile kurallari belirlenmistir
       -List
       -Queue
       -Set
       ancak interfacelerden obje olustutulamayacagi icin child classlarinin constructorlari kullanilir
       burada ozellikleri belirleyen cons degil data turu olarak secilen collectiondur


        */

        LinkedList<String>ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4=new LinkedList<>();


    }
}
