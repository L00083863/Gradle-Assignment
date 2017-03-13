public class Player{
	protected String name = "";
	protected int age = 0;
	protected int jerseyNumber = 0; 
	protected String position = "";
	protected int value = 0;

	protected Player() {
		name = position = "";
		age = jerseyNumber = value = 0;
	}

	protected Player(String name, int age, int jerseyNumber, String position, int value) {
		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.position = position;
		this.value = value;
	}
	
	public static boolean validateName(String name){
		return name.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
	}
	
	/*public static boolean validateTeamName(String teamName){
		return teamName.matches("[a-zA-Z0-9]+([ .][a-zA-Z0-9]+)*");
	}*/
	
	public static boolean validatePosition(String position){
		return position.matches("\bGoalkeeper\b || \bDefender\b || \bMidfielder\b || \bForward\b");
	}
	
	protected void setName(String name) {
		if(validateName(name) == true){
			this.name = name;
		}
		else
			throw new IllegalArgumentException("Name can only contain letters, apostrophe or hyphen");
	}
	
	protected void setAge(int age) {
		if(age < 16 || age > 50){
			throw new IllegalArgumentException("Age must be 16 or above or 50 or below ");
		}
		this.age = age;
	}
	
	protected void setJerseyNumber(int jerseyNumber) {
		if(jerseyNumber < 0){
			throw new IllegalArgumentException("Number must be a positive number.");
		}
		else{
			this.jerseyNumber = jerseyNumber;
		}
	}
	
	protected void setPosition(String setPositionTo) {
		if(validatePosition(position) == true){
			position = setPositionTo;
		}
		else
			throw new IllegalArgumentException("Position must either be Goalkeeper, Defender, Midfielder or Forward");
	}
	
	protected void setValue(int value){
		if(value < 0 || value > 200000000){
			throw new IllegalArgumentException("Be reasonable - Nobody is worth that little or that much!!");
		}
		else
			this.value = value;
	}
	
	/*protected void setTeamName(String teamName) {
		if(validateTeamName(teamName) == true){
			this.teamName = teamName;
		}
		else
			throw new IllegalArgumentException("Team Name can contain only numbers, letters or full stop");
	}*/
	
	protected int getJerseyNumber() {
		return jerseyNumber;
	}

	protected String getName() {
		return name;
	}

	protected int getValue(){
		return value;
	}
	/*protected String getTeamName() {
		return teamName;
	}*/

	protected int getAge() {
		return age;
	}

	protected String getPosition() {
		return position;
	}

	public String toString() {
		return "\t\tName: " + name + ".\t\tAge: " + age + "Jersey Number: " + jerseyNumber + ".\t\tPosition: "
				+ position + "\t\tValue: " + value + ".";
	}
}