public class Player{
	protected String fname = "";
	protected String lname = "";
	protected int age = 0;
	protected int jerseyNumber = 0; 
	protected int value = 0;
	protected Position position	;

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
		return fname.matches("[a-zA-ZÁÉÍÓÚáéíóú]+([ '-][a-zA-Záéíóú]+)*");
	}
	
	public static boolean validateLastName(String lname){
		return lname.matches("[a-zA-ZÁÉÍÓÚáéíóú]+([ '-][a-zA-Z]+)*");
	}
	
	protected void setFirstName(String fname) {
		if(validateFirstName(fname) == true){
			this.fname = fname;
		}
		else
			throw new IllegalArgumentException("First name can only contain letters, hyphens or apostrophes.");
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
	
	protected void setPosition(Position position){
		this.position = position;
	}
	
	protected void setJerseyNumber(int jerseyNumber) {
		if(jerseyNumber < 0 || jerseyNumber >= 1000){
			throw new IllegalArgumentException("Number must be a positive number but less than 1000.");
		}
		else{
			this.jerseyNumber = jerseyNumber;
		}
	}
	
	protected void setValue(int value){
		if(value < 0 || value > 200000000){
			throw new IllegalArgumentException("Be reasonable - Nobody is worth that little or that much!!");
		}
		else
			this.value = value;
	}
	
	protected int getJerseyNumber() {
		return jerseyNumber;
	}

	protected String getFirstName() {
		return fname;
	}
	
	protected String getLastName(){
		return lname;
	}
	
	protected Position getPosition(){
		return position;
	}

	protected int getValue(){
		return value;
	}

	protected int getAge() {
		return age;
	}
}