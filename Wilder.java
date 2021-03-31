package Classes;

public class Wilder {

	String firstName;
	boolean aware;
	
	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	public String whoAmI() {
		String thatsMe;
		if (aware) {
			thatsMe = "Je m'appelle " + this.firstName + " et je suis aware";
		} else {
			thatsMe = "Je m'appelle " + this.firstName + " et je ne suis pas aware";
		}
		return thatsMe;
	}
}
