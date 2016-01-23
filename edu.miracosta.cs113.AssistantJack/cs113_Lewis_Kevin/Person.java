package cs113_Lewis_Kevin;

public class Person extends TheoryItem {

	public enum PersonName {MS_SCARLET, COLONIAL_MUSTARD, MRS_WHITE, REV_GREEN, MRS_PEACOCK, PROFESSOR_PLUM };

	public static final int MAX_PERSONS = 6;
	
	public Person() {
		super(MAX_PERSONS);
	}
}
