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
