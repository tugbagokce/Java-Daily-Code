package day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {

    public static void main(String[] args) {


        TreeMap<String,Integer>harfSayilariMap=new TreeMap<>();
        harfSayilariMap.put("A",10);
        harfSayilariMap.put("C",15);
        harfSayilariMap.put("D",3);
        harfSayilariMap.put("K",5);

        System.out.println(harfSayilariMap);

        System.out.println(harfSayilariMap.subMap("C", "F"));
        System.out.println(harfSayilariMap.subMap("C", "K"));
        System.out.println(harfSayilariMap.subMap("B", "K"));

        System.out.println(harfSayilariMap);
        System.out.println(harfSayilariMap.lowerKey("E"));
        System.out.println(harfSayilariMap.lowerKey("D"));

        System.out.println(harfSayilariMap.floorKey("E"));
        System.out.println(harfSayilariMap.floorKey("D"));

        System.out.println(harfSayilariMap.higherKey("D"));
        System.out.println(harfSayilariMap.ceilingKey("D"));

        System.out.println(harfSayilariMap);

        System.out.println(harfSayilariMap.headMap("D"));
        System.out.println(harfSayilariMap.headMap("D",true));


        System.out.println(harfSayilariMap.tailMap("C"));
        System.out.println(harfSayilariMap.tailMap("C",false));

        System.out.println(harfSayilariMap.pollFirstEntry());
        System.out.println(harfSayilariMap);

        System.out.println(harfSayilariMap.pollLastEntry());


    }
}
