package com.pluralsight;
// Abstract class FixedAsset represents a general asset in the portfolio
public abstract class FixedAsset {

    // Instance variables
    private String name;           // Name of the asset
    private double marketValue;    // Market value of the asset

    // Constructor to initialize the asset's name and market value
    public FixedAsset(String name, double marketValue) {
        this.name = name;            // Set the asset's name
        this.marketValue = marketValue;  // Set the asset's market value
    }

    // Getter for the asset's name
    public String getName() {
        return name;
    }

    // Getter for the asset's market value
    public double getMarketValue() {
        return marketValue;
    }

    // Abstract method to get the value of the asset (to be implemented by subclasses)
    public abstract double getValue();
}


