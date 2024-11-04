package com.vladproduction._1_generic_methods;

import java.util.List;

/**
 * preamble to the generics;
 * substitution principle;
 * */
public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        System.out.println("---");
        List<Building> buildings = List.of(new Building(), new Building(), new Office(), new Office());
        printBuildings(buildings);

        System.out.println("---");
        List<Office> offices = List.of(new Office(), new Office());
//        printBuildings(offices); //need to have wildcard to have as parameters Office type list holder place
        //method parameter looks like this: (List<? extends Building> buildings)
    }

    static void build(Building building) {
        System.out.println("Constructing a new: " + building.toString());
    }

    static void printBuildings(List<Building> buildings){
        int count = 0;
        for (Building building : buildings) {
            System.out.println(count + 1 + " : " + building.toString());
            count++;
        }
    }
}
