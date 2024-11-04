package com.vladproduction._2_wildcards_in_generics;

public class House extends Build{

    public int numOfLevels = 3;

    @Override
    public String toString() {
        return "House";
    }

    @Override
    public int getNumOfLevels() {
        return numOfLevels;
    }

    @Override
    public void setNumOfLevels(int numOfLevels) {
        this.numOfLevels = numOfLevels;
    }
}
