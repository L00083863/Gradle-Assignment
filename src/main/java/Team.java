public class Team {
	protected String teamName;
	protected String stadiumName;
	protected String managerFName;
	protected String managerLName;
	
	protected Team(String stadiumName){
		this.stadiumName = stadiumName;
	}
	
	protected Team(String teamName, String stadiumName, String managerFName, String managerLName){
		this.teamName = teamName;
		this.stadiumName = stadiumName;
		this.managerFName = managerFName;
		this.managerLName = managerLName;
	}
	
	public static boolean validateTeamName(String teamName){
		return teamName.matches("[a-zA-Z0-9]+([ .][a-zA-Z0-9]+)*");
	}
	
	public static boolean validateStadiumName(String stadiumName){
		return stadiumName.matches("[a-zA-Z0-9]+([ '-.][a-zA-Z0-9áéíóú]+)+([ '-.][ ][a-zA-Z0-9áéíóú]+)*");
	}
	
	public static boolean validateManagerFName(String managerFName){
		return managerFName.matches("[a-zA-Záéíóú]+([ -][a-zA-Záéíóú]+)*");
	}
	
	public static boolean validateManagerLName(String managerLName){
		return managerLName.matches("[a-zA-ZÁÉÍÓÚáéíóú]+([ '-][a-zA-Záéíóú]+)*");
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
			throw new IllegalArgumentException("Stadium Name can contain letters, numbers, full stop, hypen or an apostrophe");
	}
	
	protected void setManagerFName(String managerFName){
		if(validateManagerFName(managerFName) == true){
			this.managerFName = managerFName;
		}
		else
			throw new IllegalArgumentException("Manager first name can contain letters from any language or a hyphen");
	}

	protected void setManagerLName(String managerLName){
		if(validateManagerLName(managerLName) == true){
			this.managerLName = managerLName;
		}
		else
			throw new IllegalArgumentException("Manager first name can contain letters from any language, a hyphen or an apostrophe");
	}
	protected String getTeamName(){
		return teamName;
	}
	
	protected String getStadiumName(){
		return stadiumName;
	}
	
	protected String getManagerFName(){
		return managerFName;
	}
	
	protected String getManagerLName(){
		return managerLName;
	}
}
