package ru.itsjava.lists.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Man andy = new Man("Andrey");
        Man vitya = new Man("Victor");
        Man max = new Man("Max");
        Man andy2 = new Man("Andrey");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andy,vitya,max));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.add(andy2) = " + manSet.add(andy2));
        System.out.println("manSet.contains(andy) = " + manSet.contains(andy));
        System.out.println("manSet.size() = " + manSet.size());


    }
}
