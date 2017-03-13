import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {
	Player testP = new Player("Danny Rose", 26, 3, "Defender", 20000000);
	
	//Test to set and get illegal and legal names
	@Test
	public void testGetName(){
	assertEquals("Danny Rose", testP.getName());
	}
		
	@Test
	public void testSetApostropheName(){
		testP.setName("John O'Shea");
	}
	
	@Test
	public void testSetHyphenedName(){
		testP.setName("Pierre-Emerick Aubameyang");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidName(){
		testP.setName("Harry K1ne");
	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidName2(){
		testP.setName("Edgar D#vids");
	}
	
	//Tests to set and get invalid and valid age
	@Test
	public void testGetAge(){
		assertEquals(26, testP.getAge());
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
	public void testGetInvalidJerseyNumber(){
		testP.setJerseyNumber(-3);
	}
	
	/*Tests to set and get valid and invalid team names
	@Test
	public void testGetTeamName(){
		assertEquals("Tottenham Hotspur", testP.getTeamName());
	}
	
	@Test
	public void testSetNumericalTeamName(){
		testP.setTeamName("FC Schalke 04");
	}
	
	@Test
	public void testSetNumericalTeamName2(){
		testP.setTeamName("1860 Munich");
	}
	
	@Test
	public void testSetTeamNameWithFullStop(){
		testP.setTeamName("Hull City F.C");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetIllegalTeamName(){
		testP.setTeamName("Wimbledon/MkDons");
	}*/
	
	//Tests to set and get valid and invalid positions
	@Test
	public void testGetPosition(){
		assertEquals("Defender", testP.getPosition());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetIllegalPosition(){
		testP.setPosition("Striker");
	}
	
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
