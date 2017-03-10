import java.io.Serializable;

public class Player implements Serializable{
	protected int number = 0;
	protected String name = "";
	protected String teamName = "";
	protected int age = 0;
	protected String position = "";

	protected Player() {
		name = teamName = position = "";
		age = number = 0;
	}

	protected Player(int number, String name, String teamName, int age, String position) {
		this.number = number;
		this.name = name;
		this.teamName = teamName;
		this.age = age;
		this.position = position;

	}
	
	public static boolean validateName(String name){
		return name.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
	}
	
	public static boolean validateTeamName(String teamName){
		return teamName.matches("[a-zA-Z0-9]+([ .][a-zA-Z0-9]+)*");
	}
	
	public static boolean validatePosition(String position){
		return position.matches("\bGoalkeeper\b || \bDefender\b || \bMidfielder\b || \bForward\b");
	}
	
	protected void setNumber(int jerseyNumber) {
		if(jerseyNumber < 0){
			throw new IllegalArgumentException("Number must be a positive number.");
		}
		else{
			this.number = jerseyNumber;
		}
	}

	protected void setAge(int setAgeTo) {
		if(age < 16 || age > 50){
			throw new IllegalArgumentException("Age must be 16 or above or 50 or below ");
		}
		age = setAgeTo;
	}
	
	protected void setName(String setNameTo) {
		if(validateName(name) == true){
			name = setNameTo;
		}
		else
			throw new IllegalArgumentException("Name can only contain letters, apostrophe or hyphen");
	}
	
	protected void setTeamName(String setTeamNameTo) {
		if(validateTeamName(teamName) == true){
			teamName = setTeamNameTo;
		}
		else
			throw new IllegalArgumentException("Team Name can contain only numbers, letters or full stop");
	}
	
	protected void setPosition(String setPositionTo) {
		if(validatePosition(position) == true){
			position = setPositionTo;
		}
		else
			throw new IllegalArgumentException("Position must either be Goalkeeper, Defender, Midfielder or Forward");
	}
	
	protected int getNumber() {
		return number;
	}

	protected String getName() {
		return name;
	}

	protected String getTeamName() {
		return teamName;
	}

	protected int getAge() {
		return age;
	}

	protected String getPosition() {
		return position;
	}

	public String toString() {
		return number + "\t\tName: " + name + ".\t\tPlays For: " + teamName + ".\t\tAge: " + age + ".\t\tPosition: "
				+ position + ".";
	}
}