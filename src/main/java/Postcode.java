public class Postcode {
	protected String postcode = null;
	protected String candidatePostcode = null;
	
	public Postcode(String pc){
		super();
		
		candidatePostcode = generateCanonicalPostcode(pc);
		
		if(candidatePostcode.length() < 6)
			throw new IllegalArgumentException("Postcode too short: " + candidatePostcode.length());
		
		else if(candidatePostcode.length() > 8)
			throw new IllegalArgumentException("Postcode too long: " + candidatePostcode.length());
		
		this.postcode = candidatePostcode; 
	}
		
	private String generateCanonicalPostcode(String nonCanonicalPostcode){
		String CanonicalPostcode = nonCanonicalPostcode.replaceAll("\\s+", "");
		CanonicalPostcode = CanonicalPostcode.toUpperCase();
		return CanonicalPostcode;
	}
		
	public String getPostcode(){
		return postcode;
	}
		
	public void setPostcode(String postcode){
			this.postcode = postcode;
	}
}
