public class Address {
	protected Team stadiumName;
	protected String streetName;
	protected String town;
	protected String city;
	protected String country;
	
	public Address(Team staidumName, String streetName, String town, String city, String country){
		this.stadiumName = staidumName;
		this.streetName = streetName;
		this.town = town;
		this.city = city;
		this.country = country;
	}
	
	protected Team getStadiumName(){
		return stadiumName;
	}
	
	protected String getStreetName(){
		return streetName;
	}
	
	protected String getTown(){
		return town;
	}
	
	protected String getCity(){
		return city;
	}
	
	protected String getCountry(){
		return country;
	}
	}
