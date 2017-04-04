import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;



public class TeamTest {
	Team team1 = new Team("Tottenham Hotspur", "White Hart Lane", "Mauricio",  "Pochettino");
	
	@Test
	public void testGetTeamName() {
		assertEquals("Tottenham Hotspur", team1.getTeamName());
	}
	
	@Test
	public void testGetTeamStadiumName(){
		assertEquals("White Hart Lane", team1.getStadiumName());
	}
	
	@Test
	public void testGetTeamManagerFirstName(){
		assertEquals("Mauricio", team1.getManagerFName());
	}
	
	@Test
	public void testGetTeamManagerLastName(){
		assertEquals("Pochettino", team1.getManagerLName());
	}
	
	@Test
	public void testSetTeamName(){
		team1.setTeamName("Wrexham");
		assertThat(team1.getTeamName(), is(equalTo("Wrexham")));
	}
	
	@Test
	public void testSetNumberedTeamName(){
		team1.setTeamName("1860 Munich");
		assertThat(team1.getTeamName(), is(equalTo("1860 Munich")));
	}
	
	@Test
	public void testFullStopInTeamName(){
		team1.setTeamName("Hull City F.C");
		assertThat(team1.getTeamName(), containsString("."));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidTeamName(){
		team1.setTeamName("Glasgow-Celtic");
		assertThat(team1.getTeamName(), is(equalTo("Glasgow-Celtic")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidTeamName2(){
		team1.setTeamName("Glasgow'Celtic");
		assertThat(team1.getTeamName(), is(equalTo("Glasgow'Celtic")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidTeamName3(){
		team1.setTeamName("#Spurs");
		assertThat(team1.getTeamName(), endsWith("urs"));
	}
	
	//@Test
	/*public void testSetManagerName(){
		team1.setManagerName("Sam Allerdyce");
		assertThat(team1.getManagerName(), is(equalTo("Sam Allerdyce")));
	}
	
	@Test
	public void testSetManagerHyphenedName(){
		team1.setManagerName("Jean-Yves Chay");
		assertThat(team1.getManagerName(), is(equalTo("Jean-Yves Chay")));
	}
	
	@Test
	public void testSetManagerApostropheName(){
		team1.setManagerName("Michel Preud'homme");
		assertThat(team1.getManagerName(), is(equalTo("Michel Preud'homme")));
	}
	
	@Test
	public void testSetForeignManagerName(){
		team1.setManagerName("José Mourinho");
		assertThat(team1.getManagerName(), is(equalTo("José Mourinho")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidManagerName(){
		team1.setManagerName("Jimmy-Floyd Hass;eback");
		assertThat(team1.getManagerName(), is(equalTo("Jimmy-Floyd Hass;eback")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidManagerName2(){
		team1.setManagerName("M4rtin O'Neill");
		assertThat(team1.getManagerName(), is(equalTo("M4rtin O'Neill")));
	}*/
}
