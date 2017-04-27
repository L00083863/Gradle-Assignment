import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.assertj.*;

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
		assertThat(stadiumAddress.getTown().startsWith("Lon"));
	}
	
	@Test
	public void testGetCity(){
		assertThat(stadiumAddress.getCity().endsWith("Ham"));
	}
	
	@Test
	public void testGetCountry(){
		assertThat(stadiumAddress.getCountry().contains("land"));
	}
}
