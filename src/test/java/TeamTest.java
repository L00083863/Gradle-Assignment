import static org.junit.Assert.*;

import org.junit.Test;

public class TeamTest {
	Team team1 = new Team("Tottenham Hotspur", "White Hart Lane", "Mauricio Pochettino");
	
	@Test
	public void testGetTeamName() {
		assertEquals("Tottenham Hotspur", team1.getTeamName());
	}
	
	@Test
	public void testGetTeamStadiumName(){
		assertEquals("White Hart Lane", team1.getStadiumName());
	}
	
	@Test
	public void testGetTeamManagerName(){
		assertEquals("Mauricio Pochettino", team1.getManagerName());
	}

}
