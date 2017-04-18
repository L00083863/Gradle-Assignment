public class Player{
	protected String fname = "";
	protected String lname = "";
	protected int age = 0;
	protected int jerseyNumber = 0; 
	protected int value = 0;
	protected Position position;

	protected Player() {
		fname = lname = "";
		age = jerseyNumber = value = 0;
	}

	protected Player(String fname, String lname, int age, int jerseyNumber, Position position, int value) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.position = position;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.value = value;
	}

	
	public static boolean validateFirstName(String fname){
		return fname.matches("[a-zA-Z]+([ -][a-zA-Z]+)*");
	}
	
	public static boolean validateLastName(String lname){
		return lname.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	/*public static boolean validateTeamName(String teamName){
		return teamName.matches("[a-zA-Z0-9]+([ .][a-zA-Z0-9]+)*");
	}*/
	
	public static boolean validatePosition(Position position){
		return (position.equals(Position.GOALKEEPER) || position.equals(Position.DEFENDER ) || position.equals(Position.MIDFIELDER) || position.equals(Position.FORWARD));
	}
	
	protected void setFirstName(String fname) {
		if(validateFirstName(fname) == true){
			this.fname = fname;
		}
		else
			throw new IllegalArgumentException("First name can only contain letters or hyphen");
	}
	
	protected void setLastName(String lname){
		if(validateLastName(lname) == true){
			this.lname = lname;
		}
		else
			throw new IllegalArgumentException("Last name can contain letters, hyphen or apostrophe");
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
	
	protected void setPosition(Position setPositionTo) {
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

	protected String getFirstName() {
		return fname;
	}
	
	protected String getLastName(){
		return lname;
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

	/*protected String getPosition() {
		return position;
	}*/

	public String toString() {
		return "\t\tFirst Name: " + fname + "\t\tSurname: " + lname + ".\t\tAge: " + age + "Jersey Number: " + jerseyNumber + ".\t\tPosition: "
				+ position + "\t\tValue: " + value + ".";
	}
}