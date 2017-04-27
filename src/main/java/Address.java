public class Address {
	protected Postcode postcode;
	protected Team stadiumName;
	protected String streetName;
	protected String town;
	protected String city;
	protected String country;
	
	public Address(Postcode postcode, Team staidumName, String streetName, String town, String city, String country){
		this.postcode = postcode;
		this.stadiumName = staidumName;
		this.streetName = streetName;
		this.town = town;
		this.city = city;
		this.country = country;
	}
	
	protected Team getStadiumName(){
		return stadiumName;
	}
	
	protected void setStadiumName(Team stadiumName){
		this.stadiumName = stadiumName;
	}
	
	protected String getStreetName(){
		return streetName;
	}
	
	protected void setStreetName(String streetName){
		this.streetName = streetName;
	}
	
	protected String getTown(){
		return town;
	}
	
	protected void setTown(String town){
		this.town = town;
	}
	
	protected String getCity(){
		return city;
	}
	
	protected void setCity(String city){
		this.city = city;
	}
	
	protected String getCountry(){
		return country;
	}
	
	protected void setCountry(String country){
		this.country = country;
	}
		
}
