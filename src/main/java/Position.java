public enum Position{
	GOALKEEPER("Goalkeeper"),
	DEFENDER("Defender"),
	MIDFIELDER("Midfielder"),
	FORWARD("Forward");
	
	private final String position1;
	private Position position;
	
	public static boolean validatePosition(Position position){
		return (position.equals(Position.GOALKEEPER) || position.equals(Position.DEFENDER ) || position.equals(Position.MIDFIELDER) || position.equals(Position.FORWARD));
	}
	
	private Position(final String position1){
		this.position1 = position1;
	}
	
	protected Position getPosition(){
		return position;
	}
	
	protected void setPosition(Position setPositionTo) {
		if(validatePosition(position) == true){
			position = setPositionTo;
		}
		else
			throw new IllegalArgumentException("Position must either be Goalkeeper, Defender, Midfielder or Forward");
	}
	
	@Override
	public String toString(){
		return position1;
	}
}
/*


public String getPlayerPosition(){
	return playerPosition;
}*/