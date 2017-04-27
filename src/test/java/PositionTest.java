import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {
	Position playerP = (Position.DEFENDER);
	
	@Test
	public void testSetGoalkeeperPosition(){
		playerP.setPosition(Position.GOALKEEPER);
	}
	
	@Test
	public void testGetDefenderPosition(){
		assertEquals(Position.DEFENDER, playerP.getPosition());
	}
	
	@Test
	public void testSetMidfielderPosition(){
		playerP.setPosition(Position.MIDFIELDER);
	}
	
	@Test
	public void testSetForwardPosition(){
		playerP.setPosition(Position.FORWARD);
	}
}
