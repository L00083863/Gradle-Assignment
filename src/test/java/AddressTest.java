import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {
	private Address stadiumAddress;
	
	Postcode postcode;
	Team stadiumName;
	
	@Before
	public void setUpAddress(){
		stadiumAddress = new Address(postcode, stadiumName, "High Road", "Tottenham", "London", "England");
	}
	
	public static boolean validateStreetAddress(String streetName){
		return streetName.matches("[a-zA-Z0-9]+([ '-][a-zA-Z0-9]+)*");
	}
	
	public static boolean validateTown(String town){
		return town.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	
	public static boolean validateCity(String city){
		return city.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	
	public static boolean validateCountry(String country){
		return country.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	
	@Test
	public void testGetStadiumName(){
		assertThat(stadiumAddress.getStadiumName()).isEqualTo(stadiumName);
	}
	
	@Test
	public void testGetStreet(){
		assertThat(stadiumAddress.getStreetName()).isEqualTo("High Road");
	}
	
	@Test
	public void testGetTown(){
		assertThat(stadiumAddress.getTown()).startsWith("Tott");
	}
	
	@Test
	public void testGetCity(){
		assertThat(stadiumAddress.getCity()).endsWith("don");
	}
	
	@Test
	public void testGetCountry(){
		assertThat(stadiumAddress.getCountry()).contains("land");
	}
	
	@Test
	public void testSetStadiumName(){
		Team stadiumAddress = new Team("Parkhead");
	}
	
	@Test
	public void testSetStreetAddress(){
		stadiumAddress.setStreetName("Tollcross Rd");
	}
	
	@Test
	public void testSetTown(){
		stadiumAddress.setTown("Gallowgate");
	}
	
	@Test
	public void testSetCity(){
		stadiumAddress.setCity("Glasgow");
	}
	
	@Test
	public void testSetCountry(){
		stadiumAddress.setCountry("Scotland");
	}
}
