package org.tnsif.hierachicalinheritance;

public class Android {

	private String brand;
	private String slotTpye;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotTpye() {
		return slotTpye;
	}
	public void setSlotTpye(String slotTpye) {
		this.slotTpye = slotTpye;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotTpye=" + slotTpye + ", toString()=" + super.toString() + "]";
	}
	
	//parameterized 
	public Android(String brand, String slotTpye) {
		super();
		this.brand = brand;
		this.slotTpye = slotTpye;
	}
	
	
	
}
