import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

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
	public void testSetTeamNameWithNumber(){
		team1.setTeamName("Shalke 04");
		assertThat(team1.getTeamName(), is(equalTo("Shalke 04")));
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
		assertThat(team1.getTeamName(), startsWith("#"));
	}
	
	@Test
	public void testSetStadiumName(){
		team1.setStadiumName("King Power");
		assertThat(team1.getStadiumName(), is(equalTo("King Power")));
	}
	
	@Test
	public void testSetHyphenedStadiumName(){
		team1.setStadiumName("Veltins-Arena");
		assertThat(team1.getStadiumName(), allOf(startsWith("Velt"), containsString("-Are")));
	}
	
	@Test
	public void testSetApostropheStadiumName(){
		team1.setStadiumName("St James' Park");
		assertThat(team1.getStadiumName(), both(containsString("'")).and(containsString("Park")));
	}
	
	@Test
	public void testSetDoubleBaralledStadiumName(){
		team1.setStadiumName("Fritz-Walter-Stadion");
		assertThat(team1.getStadiumName(), either(containsString("tz-")).or(containsString("xina")));
	}
	
	@Test
	public void testSetThreeSpacesInStadiumName(){
		team1.setStadiumName("Estadio Ramón Sánchez Pizjuán");
		assertThat(team1.getStadiumName(), is(equalTo("Estadio Ramón Sánchez Pizjuán")));
	}
	
	@Test
	public void testSetSpacesHyphenAndForeignLetters(){
		team1.setStadiumName("Estadi Cornellá-El Prat");
		assertThat(team1.getStadiumName(), equalTo("Estadi Cornellá-El Prat"));
	}
	
	@Test
	public void testSetSpacesAndHyphen(){
		team1.setStadiumName("Stadio Renato Dall'Ara");
		assertThat(team1.getStadiumName(), endsWith("'Ara"));
	}
	
	@Test
	public void testSetManagerFName(){
		team1.setManagerFName("Antonio");
		assertThat(team1.getManagerFName(), is(equalTo("Antonio")));
	}
	
	@Test
	public void testSetManagerHyphenedFirstName(){
		team1.setManagerFName("Jimmy-Floyd");
		assertThat(team1.getManagerFName(), is(equalTo("Jimmy-Floyd")));
	}
	
	@Test
	public void testSetForeignManagerFirstName(){
		team1.setManagerFName("José");
		assertThat(team1.getManagerFName(), is(equalTo("José")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidManagerFirstName(){
		team1.setManagerFName("Jimmy'Floyd");
		assertThat(team1.getManagerFName(), is(equalTo("Jimmy'Floyd")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetInvalidManagerFirstName2(){
		team1.setManagerFName("M4rtin");
		assertThat(team1.getManagerFName(), is(equalTo("M4rtin")));
	}
	
	@Test
	public void testSetManagerLastName(){
		team1.setManagerLName("Hughton");
		assertTrue(team1.getManagerLName().startsWith("H"));
	}
	
	@Test
	public void testSetManagerApostropheLastName(){
		team1.setManagerLName("Preud'homme");
		assertThat(team1.getManagerLName(), is(equalTo("Preud'homme")));
	}
	
	@Test
	public void testSetManagerHyphenedLastName(){
		team1.setManagerLName("Villas-Boas");
		assertTrue(team1.getManagerLName().contains("Villas-Boas"));
	}
	
	@Test
	public void testSetForeignManagerLastName(){
		team1.setManagerLName("Benítez");
		assertTrue(team1.getManagerLName().equals("Benítez"));
	}
	
	@Test
	public void testSetSpacedManagerLastName(){
		team1.setManagerLName("de Boer");
		assertThat(team1.getManagerLName(), is(equalTo("de Boer")));
	}
	
	
	
}
