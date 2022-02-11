package hashmap_demo;

import java.util.*;
class  TestCollison
{
    public static void main(String[] args)
    {

        HashMap map = new HashMap();

        Person p1 = new Person(1,"ABC");
        Person p2 = new Person(2,"DEF");
        Person p3 = new Person(1,"XYZ");
        Person p4 = new Person(1,"PQR");
        Person p5 = new Person(1,"PQR");
        System.out.println("Adding Entries ....");
        map.put(p1,"ONE");
        map.put(p2,"TWO");
        map.put(p3,"THREE");
        map.put(p4,"FOUR");
        map.put(p5,"FIVE");
        map.put(null,null);


        System.out.println("\nComplete Map entries \n" + map);

        System.out.println("\nAccessing non-collided key");
        System.out.println("Value = "+map.get(new Person(2,"DEF")));
        System.out.println("\nAccessing map with p1 key");
        System.out.println("Value = " + map.get(p1));
    }
}

