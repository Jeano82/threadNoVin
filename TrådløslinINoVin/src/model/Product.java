/**
 * 
 */
package model;

/**
 * @author AB
 *
 */
public class Product {

	private String name;
	private int alcoholProcent;
	private String contry;
	private double mesurment;
	private String description;
	private double price;
	private double fullPalletWeight;
	private double weight;
	private boolean onStock;

	public Product(String name, int alcoholProcent, String contry, double mesurment, String description, double price,
			double fullPalletWeight, double weight) {
		super();
		this.name = name;
		this.alcoholProcent = alcoholProcent;
		this.contry = contry;
		this.mesurment = mesurment;
		this.description = description;
		this.price = price;
		this.fullPalletWeight = fullPalletWeight;
		this.weight = weight;
		this.onStock = onStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlcoholProcent() {
		return alcoholProcent;
	}

	public void setAlcoholProcent(int alcoholProcent) {
		this.alcoholProcent = alcoholProcent;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public double getMesurment() {
		return mesurment;
	}

	public void setMesurment(double mesurment) {
		this.mesurment = mesurment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFullPalletWeight() {
		return fullPalletWeight;
	}

	public void setFullPalletWeight(double fullPalletWeight) {
		this.fullPalletWeight = fullPalletWeight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isOnStock() {
		return onStock;
	}

	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
	}

}
