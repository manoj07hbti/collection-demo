package tree_set;

import java.util.TreeSet;

public class DriverCode {
    // Main driver method
    public static void main(String[] args)
    {
        // Define an objects of TreeSet class
        TreeSet<Car> set = new TreeSet<Car>();

        TreeSet<Car> set2 = new TreeSet<Car>((c1,c2)->c1.name.compareTo(c2.name));

        // Creating Car objects
        Car c1 = new Car(132, "BMW", "Rajkot", 35);
        Car c2 = new Car(269, "Audi", "Surat", 20);
        Car c3 = new Car(560, "Kia", "Vadodara", 15);
        Car c4 = new Car(109, "Creta", "Ahmedabad", 26);

        // Adding Car objects to TreeSet
        set2.add(c1);
        set2.add(c2);
        set2.add(c3);
        set2.add(c4);
        System.out.println("Car Name sorting ");
        // Traversing TreeSet
        for (Car c : set2) {
            System.out.println(c.stock + " " + c.name + " "
                    + c.city + " " + c.Modelno);
        }

        System.out.println("Stock number sorting ");
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

        // Traversing TreeSet
        for (Car c : set) {
            System.out.println(c.stock + " " + c.name + " "
                    + c.city + " " + c.Modelno);
        }
    }
}
