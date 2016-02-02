package edu.miracosta.cs113.hw1.assistant;

/**
 * @author lewiske
 *
 */
public final class TheoryItem {

	public static final int TOTAL_MURDERS = 6;
	public static final int TOTAL_LOCATIONS = 10;
	public static final int TOTAL_WEAPONS = 6;
	
	/**
	 * @param location
	 * @return
	 */
	public static String getLocationName(int location) {
		String locationName = null;
		
		switch(location){
		case 1:
			locationName = "Kitchen";
			break;
		case 2: 
			locationName = "Ballroom";
			break;
		case 3:
			locationName = "Conservatory";
			break;
		case 4:
			locationName = "Billiard";
			break;
		case 5:
			locationName = "Library";
			break;
		case 6:
			locationName = "Study";
			break;
		case 7:
			locationName = "Hall";
			break;
		case 8:
			locationName = "Lounge";
			break;
		case 9:
			locationName = "Dining";
			break;
		case 10:
			locationName = "Cellar";
			break;
		}
		return locationName;
	}
	
	/**
	 * @param location
	 * @return
	 */
	public static int getLocationNumber(String location){
		int locationNumber = 0;
		
		switch(location.toLowerCase()){
		case "kitchen":
			locationNumber = 1;
			break;
		case "ballroom":
			locationNumber = 2;
			break;
		case "conservatory":
			locationNumber = 3;
			break;
		case "billiard":
			locationNumber = 4;
			break;
		case "library":
			locationNumber = 5;
			break;
		case "study":
			locationNumber = 6;
			break;
		case "hall":
			locationNumber = 7;
			break;
		case "lounge":
			locationNumber = 8;
			break;
		case "dining":
			locationNumber = 9;
			break;
		case "cellar":
			locationNumber = 10;
			break;
		}
		return locationNumber;
	}
	
	/**
	 * @param location
	 * @return
	 */
	public static boolean validateLocationNumber(int location){
		if(location >= 1 && location <= 6) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * @param person
	 * @return
	 */
	public static String getPersonName(int person) {
		String personString = null;
		
		switch(person) {
		case 1:
			personString = "Ms. Scarlet";
			break;
		case 2:
			personString = "Colonial Mustard";
			break;
		case 3:
			personString = "Mrs. White";
			break;
		case 4:
			personString = "Reverend Green";
			break;
		case 5: 
			personString = "Mrs. Peacock";
			break;
		case 6:
			personString = "Professor Plum";
			break;
		}
		return personString;
	}
	
	/**
	 * @param person
	 * @return
	 */
	public static int getPersonNumber(String person) {
		int personNumber = 0;
		
		switch(person.toLowerCase()){
		case "ms. scarlet":
			personNumber = 1;
			break;
		case "colonial mustard":
			personNumber = 2;
			break;
		case "mrs. white":
			personNumber = 3;
			break;
		case "reverend green":
			personNumber = 4;
			break;
		case "mrs. peacock":
			personNumber = 5;
			break;
		case "professor plum":
			personNumber = 6;
			break;
		}
		return personNumber;
	}
	
	public static boolean validatePersonNumber(int person){
		if(person >= 1 && person <= 6) {
			return true;
		}
		return false;
	}
	
	public static String getWeaponName(int weapon)
	{
		String weaponString = null;
		
		switch(weapon){
		case 1:
			weaponString = "rope";
			break;
		case 2:
			weaponString = "wrench";
			break;
		case 3: 
			weaponString = "candlestick";
			break;
		case 4:
			weaponString = "revolver";
			break;
		case 5:
			weaponString = "knife";
			break;
		case 6:
			weaponString = "pipe";
			break;
			
		}		
		return weaponString;
	}
	
	public static int getWeaponNumber(String weapon) {
		int weaponNumber = 0;
		
		switch(weapon.toLowerCase()) {
		case "rope":
			weaponNumber = 1;
			break;
		case "wrench":
			weaponNumber = 2;
			break;
		case "candlestick":
			weaponNumber = 3;
			break;
		case "revolver":
			weaponNumber = 4;
			break;
		case "knife":
			weaponNumber = 5;
			break;
		case "pipe":
			weaponNumber = 6;
			break;
		}
		return weaponNumber;
	}
	
	public static boolean validateWeaponNumber(int weapon){
		if(weapon >= 1 && weapon <= 6) {
			return true;
		}
		return false;
	}
	
}
