package classes;

public class Location {
	private String country, state, city;
	private int postalCode;
	
	public Location() {
		country = "";
		state = "";
		city = "";
		postalCode = 0;
	}
	
	public Location(String country, String state, String city) {
		this.country = country;
		this.state = state;
		this.city = city;
		postalCode = 0;
	}
	
	public Location(String country, String state, String city, int postalCode) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
