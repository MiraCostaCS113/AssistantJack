package cs113_Lewis_Kevin;

public class Location extends TheoryItem {
	
	public enum LocationName { KITCHEN, BALLROOM, CONSERVATORY,
		BILLIARD, LIBRARY, STUDY, HALL, LOUNGE, DINING, CELLAR }
	
	public static final int MAX_LOCATIONS = 10;
	
	public Location() {
		super(MAX_LOCATIONS);
	}
}
