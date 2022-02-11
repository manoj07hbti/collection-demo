package tree_set;

import java.util.*;

// Custome class Car implements Comparable interface
class Car implements Comparable<Car> {

    // attributes
    int Modelno;
    String name, city;
    int stock;

    // Car constructor
    public Car(int Modelno, String name, String city,
               int stock)
    {
        this.Modelno = Modelno;
        this.name = name;
        this.city = city;
        this.stock = stock;
    }

    // Override the compareTo() method
    public int compareTo(Car c)
    {
        if (stock > c.stock) {
            return 1;
        }
        else if (stock < c.stock) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
