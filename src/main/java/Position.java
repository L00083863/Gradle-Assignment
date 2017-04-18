public enum Position{
	GOALKEEPER("Goalkeeper"),
	DEFENDER("Defender"),
	MIDFIELDER("Midfielder"),
	FORWARD("Forward");
	
	private final String position;
	
	private Position(final String position){
		this.position = position;
	}
	
	@Override
	public String toString(){
		return position;
	}
}
/*private String playerPosition;

private Position(String playerPosition){
	this.playerPosition = playerPosition;
}

public String getPlayerPosition(){
	return playerPosition;
}*/