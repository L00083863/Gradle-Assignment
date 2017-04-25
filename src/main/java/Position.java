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
/*


public String getPlayerPosition(){
	return playerPosition;
}*/