public enum Position {
	Goalkeeper ("GK"),
	Defender ("DF"),
	Midfielder ("MD"),
	Forward ("FW");
	
	private String playerPosition;
	
	private Position(String playerPosition){
		this.playerPosition = playerPosition;
	}
	
	public String getPlayerPosition(){
		return playerPosition;
	}
}
