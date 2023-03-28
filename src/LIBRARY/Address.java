package LIBRARY;

public class Address {
	
	private int pincode;
	private String street;
	private String city;
	private String state;
	private String country;
	
	public Address(int pincode, String street, String city, String state, String country) {
		this.pincode = pincode;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
    
	
	
	
	

}
