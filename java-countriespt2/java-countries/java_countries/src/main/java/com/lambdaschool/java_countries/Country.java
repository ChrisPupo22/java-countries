package com.lambdaschool.java_countries;

import java.util.*;


public class Country {
    private String countryName;
    private long population;
    private long medianPop;
    private int medianAge;

    public Country(String countryName, long population, long medianPop, int medianAge) {
        this.countryName = countryName;
        this.population = population;
        this.medianPop = medianPop;
        this.medianAge = medianAge;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getMedianPop() {
        return medianPop;
    }

    public void setMedianPop(long medianPop) {
        this.medianPop = medianPop;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", medianPop=" + medianPop +
                ", medianAge=" + medianAge +
                '}';
    }

}
