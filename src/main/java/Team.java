public class Team {
	protected String teamName;
	protected String stadiumName;
	protected String managerFName;
	protected String managerLName;
	
	protected Team(){
		teamName = stadiumName = managerFName = managerLName;
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
		return stadiumName.matches("[a-zA-Z0-9]+([ .-'][a-zA-Z0-9]+)*");
	}
	
	public static boolean validateManagerName(String managerFName){
		return managerFName.matches("[a-zA-Záéíóú]+([ '-][a-zA-Z]+)*");
	}
	
	public static boolean validateManagerLName(String managerLName){
		return managerLName.matches("[a-zA-Záéíóú]+([ '-][a-zA-Z]+)*");
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
	
	protected void setManagerFName(String managerFName){
		if(validateManagerName(managerFName) == true){
			this.managerFName = managerFName;
		}
		else
			throw new IllegalArgumentException("Manager first name can contain letters from any language, a hyphen or an apostrophe");
	}

	protected void setManagerLName(String managerLName){
		if(validateManagerName(managerLName) == true){
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
	
	public String toString(){
		return "Team Name: " + teamName + "\t\tStadium Name: " + stadiumName + 
				"\t\tManager First Name: " +managerFName+ "\t\tManager Surname: "+managerLName;
	}
}
