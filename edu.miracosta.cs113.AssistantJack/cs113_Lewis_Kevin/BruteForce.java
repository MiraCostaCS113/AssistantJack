package cs113_Lewis_Kevin;

public class BruteForce {

	public static void main(String[] args) {

		AssistantJack jack = new AssistantJack(0);
		
		int foundMurder = 0;
		int foundWeapon = 0;
		int foundLocation = 0;
		for (int m = 1; m <= TheoryItem.TOTAL_MURDERS; m++) {
			for (int l = 1; l <= TheoryItem.TOTAL_LOCATIONS; l++) {
				for (int w = 1; w <= TheoryItem.TOTAL_WEAPONS;w++) {
					int checkAnswer = jack.checkAnswer(m, l, w);
					System.out.println("Check Answer = " + checkAnswer);
					if(checkAnswer == 0) {
						foundMurder = m;
						foundWeapon = w;
						foundLocation = l;
					}
				}
			}
		}
		System.out.println("The correct answer is " + 
				foundMurder + "," + 
						foundLocation + "," + 
								foundWeapon);


	}

}