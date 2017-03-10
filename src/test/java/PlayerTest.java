import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class PlayerTest {
	Player testP = new Player(3, "Danny Rose", "Tottenham Hotspur", 24, "Defender");
	
	@Test
	public void testGetNumber(){
		assertEquals(3, testP.getNumber());
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetNegativeNumber(){
		testP.setNumber(-3);
	}
	
	@Test
	public void testGetName(){
		assertEquals("Danny Rose", testP.getName());
	}
	
	@Test
	public void testGetTeamName(){
		assertEquals("Tottenham Hotspur", testP.getTeamName());
	}
	
	@Test
	public void testGetAge(){
		assertEquals(24, testP.getAge());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAgeToYoung(){
		testP.setAge(14);
	}
	
	@Test
	public void getPosition(){
		assertEquals("Defender", testP.getPosition());
	}
}
