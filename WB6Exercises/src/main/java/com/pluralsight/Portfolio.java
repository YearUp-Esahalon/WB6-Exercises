package com.pluralsight;
import java.util.ArrayList;

// Portfolio interface defines the contract for any portfolio class
public interface Portfolio {
    // Declare the variables as constants (they don't store data directly in the interface)
    String name = "";  // Portfolio name
    String owner = ""; // Portfolio owner
    ArrayList<FixedAsset> assets = new ArrayList<>(); // List to hold assets (generic type FixedAsset)

    // Constructor: Java interfaces cannot have constructors directly,
    // so this will just be part of the method signature
    void Portfolio(String name, String owner);

    // Method to add an asset to the portfolio
    void add(FixedAsset asset);

    // Method to calculate and return the total value of all assets in the portfolio
    double getValue();
}





