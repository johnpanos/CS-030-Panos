package edu.westmont.cs030;

/**
 * Car class
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Feb 3, 2020
 *
 */
public class Car {
	private double purchasePrice;
	private double depreciationPerYear;
	private double maintenanceCostPerMile;
	private double milesPerGallon;
	
	/**
	 * Creates a car object
	 * @param purchasePrice The original purchase price of the car
	 * @param depreciationPerYear How much the car depreciated per year in dollars
	 * @param maintenanceCostPerMile How much the car costs in maintenance per mile
	 * @param milesPerGallon How many miles the car gets per gallon
	 */
	public Car(
			double purchasePrice,
			double depreciationPerYear,
			double maintenanceCostPerMile,
			double milesPerGallon
			) {
		this.purchasePrice = clamp(purchasePrice);
		this.depreciationPerYear = clamp(depreciationPerYear);
		this.maintenanceCostPerMile = clamp(maintenanceCostPerMile);
		this.milesPerGallon = clamp(milesPerGallon);
	}
	
	/**
	 * Calculate the total cost of ownership of the car over the years
	 * @param yearsOwned How many years you owned the car
	 * @param milesPerYear How many miles you drove per year
	 * @param dollarsPerGallon How many dollars a gallon of gas cost
	 * @return Total cost of ownership
	 */
	public double calculateCostOfOwnership(double yearsOwned, double milesPerYear, double dollarsPerGallon) {
		return this.getPurchasePrice()
				+ (this.getMaintenanceCostPerMile() * milesPerYear * yearsOwned)
				+ this.totalGasCost(milesPerYear * yearsOwned, dollarsPerGallon)
				- this.resaleValue(yearsOwned);
	}
	
	/**
	 * Get the depreciation per year
	 * @return The depreciation per year
	 */
	public double getDepreciationPerYear() {
		return this.depreciationPerYear;
	}
	
	/**
	 * Gets the maintenance cost per mile
	 * @return The maintenance cost per mile
	 */
	public double getMaintenanceCostPerMile() {
		return this.maintenanceCostPerMile;
	}
	
	/**
	 * Gets the miles per gallon of the car
	 * @return The miles per gallon of the car
	 */
	public double getMilesPerGallon() {
		return this.milesPerGallon;
	}
	
	/**
	 * Gets the original purchase price of the car
	 * @return The original purchase price of the car
	 */
	public double getPurchasePrice() {
		return this.purchasePrice;
	}
	
	/**
	 * How much you can sell the car for after a few years 
	 * @param years How many years you have owned the car
	 * @return The resale value of the car after a few years
	 */
	public double resaleValue(double years) {
		double resalePrice = this.purchasePrice - (this.depreciationPerYear * years);
		return clamp(resalePrice);
	}
	
	/**
	 * Get total gas cost from the amount of miles
	 * @param miles The amount of miles you drove
	 * @param dollarsPerGallon How much a gallon of gas cost
	 * @return The total gas cost
	 */
	public double totalGasCost(double miles, double dollarsPerGallon) {
		return miles / (milesPerGallon / dollarsPerGallon);
	}
	
	/**
	 * Make sure a value cannot go below 0 by clamping it
	 * @param in The value to clamp above 0
	 * @return The clamped value
	 */
	private double clamp(double in) {
		return in < 0 ? 0 : in;
	}
}
