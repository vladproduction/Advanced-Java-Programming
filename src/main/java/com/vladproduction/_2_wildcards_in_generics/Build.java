package com.vladproduction._2_wildcards_in_generics;

public class Build {

    public int numOfLevels = 5;

    @Override
    public String toString() {
        return "build";
    }

    public int getNumOfLevels() {
        return numOfLevels;
    }

    public void setNumOfLevels(int numOfLevels) {
        this.numOfLevels = numOfLevels;
    }
}
