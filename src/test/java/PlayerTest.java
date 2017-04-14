import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest{
	Player testP = new Player("Danny", "Rose", 26, 3, Position.DEFENDER, 20000000);
	
	//Test to set and get illegal and legal names
	@Test
	public void testGetFirstName(){
		assertEquals("Danny", testP.getFirstName());
	}
	
	@Test
	public void testSetHyphenedFirstName(){
		testP.setFirstName("Pierre-Emerick");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidFirstName(){
		testP.setFirstName("H4nry");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidFirstName2(){
		testP.setFirstName("Pierre.Emerick");
	}
	
	@Test
	public void testGetSurname(){
		assertEquals("Rose", testP.getLastName());
	}
	
	@Test
	public void testSetHyphenedSurname(){
		testP.setLastName("Robson-Kanu");
	}
	
	@Test
	public void testSetApostropheSurname(){
		testP.setLastName("O'Shea");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidSurname(){
		testP.setLastName("O+Shea");
	}
	//Tests to set and get invalid and valid age
	@Test
	public void testGetAge(){
		assertEquals(26, testP.getAge());
	}
	
	@Test
	public void testSetValidAge(){
		testP.setAge(27);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetAgeToYoung(){
		testP.setAge(12);
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetAgeToOld(){
		testP.setAge(51);
	}
	
	
	//Tests to get/set jersey number
	
	@Test
	public void testGetJerseyNumber(){
		assertEquals(3, testP.getJerseyNumber());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidJerseyNumber(){
		testP.setJerseyNumber(-3);
	}
	
	//Tests to set and get valid and invalid positions
	/*@Test
	public void testGetPosition(){
		assertEquals("Defender", testP.getPlayerPosition());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetIllegalPosition(){
		testP.setPosition("Striker");
	}*/
	
	@Test
	public void testGetValue(){
		assertEquals(20000000, testP.getValue());
	}
	
	@Test
	public void testSetValue(){
		testP.setValue(150000);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetValueToHigh(){
		testP.setValue(250000000);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetValueToLow(){
		testP.setValue(-150000);
	}
}
