import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AddressTest {
	private Address stadiumAddress;
	
	Postcode postcode;
	Team stadiumName;
	
	@Before
	public void setUpAddress(){
		stadiumAddress = new Address(postcode, stadiumName, "High Road", "Tottenham", "London", "England");
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
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testSetStadiumName(){
		Team stadiumAddress = new Team("Parkhead");
	}
	
	@Test
	public void testSetStreetName(){
		stadiumAddress.setStreetName("Tollcross Rd");
	}
	
	@Test
	public void testSetInvalidStreetName(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Street name can contain letters");
		stadiumAddress.setStreetName("123 Baker Street");
	}
	
	@Test
	public void testSetInvalidStreetName2(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Street name can contain letters");
		stadiumAddress.setStreetName("Baker' Street");
	}
	
	@Test
	public void testSetInvalidStreetName3(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Street name can contain letters");
		stadiumAddress.setStreetName("Baker-Street");
	}
	
	@Test
	public void testSetHyphenedTownName(){
		stadiumAddress.setTown("Berwick-upon-Tweed");
	}
	
	@Test
	public void testSetApostropheTownName(){
		stadiumAddress.setTown("Bishop's Castle");
	}
	
	@Test
	public void testSetInvalidTownName(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Town name can only contain letters, hyphens or apostrophes");
		stadiumAddress.setTown("123 Baker Street");
	}
	
	@Test
	public void testSetCityName(){
		stadiumAddress.setCity("Brighton & Hove");
	}
	
	@Test
	public void testSetHyphenedCityName(){
		stadiumAddress.setCity("Stoke-on-Trent");
	}
	
	@Test
	public void testSetInvalidCityNameWithNumbers(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("City name can only contain &, letters or hyphens.");
		stadiumAddress.setCity("123 Baker Street");
	}
	
	@Test
	public void testSetInvalidCityNameWithApostrophe(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("City name can only contain &, letters or hyphens.");
		stadiumAddress.setCity("Liver'pool");
	}
	
	@Test
	public void testSetCountry(){
		stadiumAddress.setCountry("Scotland");
	}
	
	@Test
	public void testSetInvalidCountryNameWithSymbol(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Country name can only contain letters.");
		stadiumAddress.setCountry("Trinidad & Tobago");
	}
	
	@Test
	public void testSetInvalidCountryNameWithApostrophe(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Country name can only contain letters.");
		stadiumAddress.setCountry("Norn'Areland");
	}
}
