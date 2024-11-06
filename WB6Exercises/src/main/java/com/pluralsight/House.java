package com.pluralsight;

// House class represents a specific type of FixedAsset
public class House extends FixedAsset {

    private int yearBuilt;      // Year the house was built
    private int squareFeet;     // Square footage of the house
    private int bedrooms;       // Number of bedrooms in the house

    // Constructor to initialize the house asset with yearBuilt, squareFeet, and bedrooms
    public House(int yearBuilt, int squareFeet, int bedrooms, double marketValue) {
        super("House", marketValue);  // Call the parent class (FixedAsset) constructor with the name "House"
        this.yearBuilt = yearBuilt;   // Set the year the house was built
        this.squareFeet = squareFeet; // Set the square footage of the house
        this.bedrooms = bedrooms;    // Set the number of bedrooms
    }

    // Implement the getValue method for a house asset
    @Override
    public double getValue() {
        // Calculate the value based on square footage and market value per square foot
        double value = squareFeet * getMarketValue(); // Assume marketValue is price per square foot
        return value;  // Return the calculated value
    }

    // Getters for the House's properties
    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    // Setter for yearBuilt (optional, for modifying the year after object creation)
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Setter for squareFeet (optional)
    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    // Setter for bedrooms (optional)
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
