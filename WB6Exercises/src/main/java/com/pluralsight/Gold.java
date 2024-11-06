package com.pluralsight;
// Gold class represents an asset of type Gold
public class Gold extends FixedAsset {

    private double weight;  // Weight of the gold (in units like ounces or kilograms)

    // Constructor to initialize the gold asset with weight
    public Gold(double weight, double marketValue) {
        super("Gold", marketValue);  // Call the parent class (FixedAsset) constructor with the name "Gold"
        this.weight = weight;  // Set the weight of the gold
    }

    // Implement the getValue method for a gold asset
    @Override
    public double getValue() {
        // Value is calculated by multiplying the weight of the gold with its market value per unit weight
        return weight * getMarketValue();  // getMarketValue() is inherited from FixedAsset
    }

    // Getter for the weight
    public double getWeight() {
        return weight;
    }

    // Setter for the weight (optional if you want to modify the weight after creation)
    public void setWeight(double weight) {
        this.weight = weight;
    }
}


