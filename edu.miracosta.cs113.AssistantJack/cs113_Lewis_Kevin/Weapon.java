package cs113_Lewis_Kevin;

public class Weapon extends TheoryItem {
	
	public enum WeaponName { ROPE, WRENCH, CANDLESTICK, REVOLVER, KNIFE, PIPE }
	
	public final static int MAX_WEAPONS = 6;

	public Weapon() {
		super(MAX_WEAPONS);
	}
	
	
}
