import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PostcodeTest {
	private Postcode validCode = new Postcode("SW1A OPW");
	Postcode postcode = new Postcode("HU5 XZWY");

	@Test
	public void testValidPostcode(){
		assertThat(validCode.getPostcode()).startsWith("SW1A");
		assertThat(validCode.getPostcode()).endsWith("OPW");
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testPostcodeTooLong(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Postcode too long: 9");
		Postcode postcodeTooLong = new Postcode("SW1B B271B");
	}
	
	@Test
	public void testPostcodeTooShort(){
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Postcode too short: 5");
		Postcode postcodeTooShort = new Postcode("SW1B B");
	}
	
	@Test
	public void testSetPostcode(){
		postcode.setPostcode("nw32 681");
	}
}

