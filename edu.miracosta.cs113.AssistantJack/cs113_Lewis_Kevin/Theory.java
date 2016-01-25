package cs113_Lewis_Kevin;

public class Theory {
	private int weapon;
	private int location;
	private int person;
	
	public Theory(int weapon, int location, int person) {
		this.weapon = weapon;
		this.location = location;
		this.person = person;
	}
	
	public Theory(Theory other) {
		this.weapon = other.weapon;
		this.location = other.location;
		this.person = other.person;
	}
	
	
	public int getWeapon() {
		return weapon;
	}
	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		final Theory other = (Theory)obj;
		
		if(this.weapon != other.weapon 
				|| this.person != other.person 
				|| this.location != other.location) {
			return false;
		}
		
		return true;
		
	}
	
}
