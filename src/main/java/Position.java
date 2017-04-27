public enum Position{
	GOALKEEPER("Goalkeeper"),
	DEFENDER("Defender"),
	MIDFIELDER("Midfielder"),
	FORWARD("Forward");
	
	private final String position;
	
	private Position(String position){
		this.position = position;
	}
	
	protected String getPosition(){
		return position;
	}

}