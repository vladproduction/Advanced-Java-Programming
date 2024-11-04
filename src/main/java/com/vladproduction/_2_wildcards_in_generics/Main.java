package com.vladproduction._2_wildcards_in_generics;

import java.util.ArrayList;

import java.util.List;

/**
 *  Commercial and House both extend Build class.
 *  They inherit properties and methods of Build.
 * */
public class Main {
    public static void main(String[] args) {
        // List of buildings
        List<Build> buildings = new ArrayList<>();
        buildings.add(new Build());
        buildings.add(new Build());
        printBuild(buildings);

        // List of commercials
        List<Commercial> commercials = new ArrayList<>();
        commercials.add(new Commercial());
        commercials.add(new Commercial());
        printBuild(commercials);//Commercial is-a type of parent class Build by inheritance rule

        // List of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuild(houses);//House is-a type of parent class Build by inheritance rule

        //add as only Houses
        addHouseToList(houses);
        //addHouseToList(buildings); //unavailable - method can hold only types of House

        //add as super type of House class
        addSuperHouseToList(houses); //can add list of Houses
        addSuperHouseToList(buildings);//can add list of Builds as super type of House
        //addSuperHouseToList(commercials); //unavailable - method can hold only types of House and super type which is Build class
        //Commercial and House both on the same level of hierarchy, so Commercial 'is-not-a' House
        //but at the same time both are subtypes of Build class

    }

    /**
     * Can pass any List of type that extends the Build class.
     * This allows for type safety as the method can print any subtype of Build.
     * invariable
     */

    private static void printBuild(List<? extends Build> buildings) {
        System.out.println("printBuild(List<? extends Build> buildings):");
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    /**
     * Currently, this method can only accept List<House> to ensure type safety,
     * meaning that only House objects will be processed here.
     */

    static void addHouseToList(List<House> houses) {
        System.out.println("addHouseToList(List<House> houses):");
        for (House house : houses) {
            System.out.println(house);
        }
        System.out.println();
    }

    /**
     * This method can accept lists that are super types of House (such as Build).
     * It allows for adding House objects to its list while maintaining type safety.
     */

    static void addSuperHouseToList(List<? super House> superHouses) {
        System.out.println("addSuperHouseToList(List<? super House> buildings) :");
        for (Object superHouse : superHouses) {
            System.out.println(superHouse);

        }
        System.out.println();
    }

}
