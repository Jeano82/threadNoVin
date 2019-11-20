/**
 * 
 */
package model;

/**
 * @author AB
 *
 */
public class ProductLocation {
	private int rackNumber;
	private int rowNumber;
	private int shelfeNumber;
	private int palletNumber;
	private int amount;

	public ProductLocation(int rackNumber, int rowNumber, int shelfeNumber, int palletNumber, int amount) {
		super();
		this.rackNumber = rackNumber;
		this.rowNumber = rowNumber;
		this.shelfeNumber = shelfeNumber;
		this.palletNumber = palletNumber;
		this.amount = amount;
	}

	public int getRackNumber() {
		return rackNumber;
	}

	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public int getShelfeNumber() {
		return shelfeNumber;
	}

	public void setShelfeNumber(int shelfeNumber) {
		this.shelfeNumber = shelfeNumber;
	}

	public int getPalletNumber() {
		return palletNumber;
	}

	public void setPalletNumber(int palletNumber) {
		this.palletNumber = palletNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
