package edu.miracosta.cs113.hw1.assistant;

/**
 * @author lewiske
 *
 */
public class Theory {
	private int weapon;
	private int location;
	private int person;
	
	/**
	 * @param weapon
	 * @param location
	 * @param person
	 */
	public Theory(int weapon, int location, int person) {
		this.weapon = weapon;
		this.location = location;
		this.person = person;
	}
	
	/**
	 * @param other
	 */
	public Theory(Theory other) {
		this.weapon = other.weapon;
		this.location = other.location;
		this.person = other.person;
	}
	
	
	/**
	 * @return
	 */
	public int getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon
	 */
	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}
	/**
	 * @return
	 */
	public int getLocation() {
		return location;
	}
	/**
	 * @param location
	 */
	public void setLocation(int location) {
		this.location = location;
	}
	/**
	 * Getter for the person/murder. 
	 * 
	 * @return the set value of the murder. 
	 */
	public int getPerson() {
		return person;
	}
	/**
	 * Setter for the person/murder.
	 * 
	 * @param person the person who committed the crime
	 */
	public void setPerson(int person) {
		this.person = person;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
