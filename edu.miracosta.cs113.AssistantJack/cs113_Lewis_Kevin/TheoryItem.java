package cs113_Lewis_Kevin;

public abstract class TheoryItem {
	private int maxValues;
	
	public TheoryItem(int max) {
		this.maxValues = max;
	}
	
	public boolean validate(int test) {
		if (test <= 0 || test > this.maxValues) {
			return false;
		}
		return true;
	}

}
