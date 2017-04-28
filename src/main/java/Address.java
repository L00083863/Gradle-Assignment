public class Address {
	protected Team stadiumName;
	protected String streetName;
	protected String town;
	protected String city;
	protected String country;
	
	public Address(Postcode postcode, Team staidumName, String streetName, String town, String city, String country){
		this.stadiumName = staidumName;
		this.streetName = streetName;
		this.town = town;
		this.city = city;
		this.country = country;
	}
	
	
	public static boolean validateStreetName(String streetName){
		return streetName.matches("[a-zA-Z]+([ ][a-zA-Z]+)*");
	}
	
	public static boolean validateTown(String town){
		return town.matches("[a-zA-Z]+([ '-][a-zA-Z]+)+([ '-][ ][a-zA-Z]+)*");
	}
	
	public static boolean validateCity(String city){
		return city.matches("[a-zA-Z]+([ -][ &a-zA-Z]+)+([ -][a-zA-Z]+)*");
	}
	
	public static boolean validateCountry(String country){
		return country.matches("[a-zA-Z]+([ ][a-zA-Z]+)*");
	}
	
	
	protected Team getStadiumName(){
		return stadiumName;
	}
	
	protected String getStreetName(){
		return streetName;
	}
	
	protected void setStreetName(String streetName) {
		if(validateStreetName(streetName) == true){
			this.streetName = streetName;
		}
		else
			throw new IllegalArgumentException("Street name can contain letters.");
	}
	
	protected String getTown(){
		return town;
	}
	
	protected void setTown(String town) {
		if(validateTown(town) == true){
			this.town = town;
		}
		else
			throw new IllegalArgumentException("Town name can only contain letters, hyphens or apostrophes.");
	}	
	protected String getCity(){
		return city;
	}
	
	protected void setCity(String city) {
		if(validateCity(city) == true){
			this.city = city;
		}
		else
			throw new IllegalArgumentException("City name can only contain &, letters or hyphens.");
	}
	
	protected String getCountry(){
		return country;
	}
	
	protected void setCountry(String country) {
		if(validateCountry(country) == true){
			this.country = country;
		}
		else
			throw new IllegalArgumentException("Country name can only contain letters.");
	}
		
}
