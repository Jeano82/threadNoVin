/**
 * 
 */
package model;

/**
 * @author AB
 *
 */
public class Warehouse {
	private String address;
	private String city;
	private int zipcode;
	private boolean isFullPallets;

	public String getAddress() {
		return address;
	}

	public Warehouse(String address, String city, int zipcode, boolean isFullPallets) {
		super();
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.isFullPallets = isFullPallets;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public boolean isFullPallets() {
		return isFullPallets;
	}

	public void setFullPallets(boolean isFullPallets) {
		this.isFullPallets = isFullPallets;
	}

}
