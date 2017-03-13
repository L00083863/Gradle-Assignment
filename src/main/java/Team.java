public class Team {
	protected String teamName;
	protected String stadiumName;
	protected String managerName;
	
	protected Team(){
		teamName = stadiumName = managerName = "";
	}
	
	protected Team(String teamName, String stadiumName, String managerName){
		this.teamName = teamName;
		this.stadiumName = stadiumName;
		this.managerName = managerName;
	}
	
	public static boolean validateTeamName(String teamName){
		return teamName.matches("[a-zA-Z0-9]+([ .][a-zA-Z0-9]+)*");
	}
	
	public static boolean validateStadiumName(String stadiumName){
		return stadiumName.matches("[a-zA-Z0-9]+([ .-'][a-zA-Z0-9]+)*");
	}
	
	public static boolean validateManagerName(String managerName){
		return managerName.matches("[a-zA-Z]+([ -'][\\p{L}][a-zA-Z]+)*");
	}
	
	protected void setTeamName(String teamName){
		if(validateTeamName(teamName) == true){
			this.teamName = teamName;
		}
		else
			throw new IllegalArgumentException("Team Name can only contain numbers, letters or a full stop");
	}
	
	protected void setStadiumName(String stadiumName){
		if(validateStadiumName(stadiumName) == true){
			this.stadiumName = stadiumName;
		}
		else
			throw new IllegalArgumentException("Staidum Name can contain letters, numbers, full stop, hypen or an apostrophe");
	}
	
	protected void setManagerName(String managerName){
		if(validateManagerName(managerName) == true){
			this.managerName = managerName;
		}
		else
			throw new IllegalArgumentException("Manager name can contain letters from any language, a hyphen or an apostrophe");
	}
	
	protected String getTeamName(){
		return teamName;
	}
	
	protected String getStadiumName(){
		return stadiumName;
	}
	
	protected String getManagerName(){
		return managerName;
	}
	
	public String toString(){
		return "Team Name: " + teamName + "\t\tStadium Name: " + stadiumName + "\t\tManager Name: " +managerName;
	}
}
