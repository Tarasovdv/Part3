package ru.itsjava.lists.sets.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    public static void main(String[] args) {

        Fruits apple = new Fruits("Apple", 200);
        Fruits banana = new Fruits("Banana", 250);
        Fruits watermelow = new Fruits("Watermelow", 10.000);
        Fruits pinapple = new Fruits("Pinapple", 3.000);

        Set<Fruits> fruitsSet = new HashSet<>(Arrays.asList(apple,banana,pinapple));
        System.out.println("fruitsSet = " + fruitsSet);

        fruitsSet.add(watermelow);
        System.out.println("fruitsSet = " + fruitsSet);

        System.out.println("fruitsSet.add(watermelow) = " + fruitsSet.add(watermelow));
        System.out.println("fruitsSet = " + fruitsSet);

        System.out.println("fruitsSet.contains(apple) = " + fruitsSet.contains(apple));
        System.out.println("fruitsSet.remove(apple) = " + fruitsSet.remove(apple));
        System.out.println("fruitsSet.contains(apple) = " + fruitsSet.contains(apple));
        System.out.println("fruitsSet = " + fruitsSet);


    }
}
