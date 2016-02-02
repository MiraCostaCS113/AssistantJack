package edu.miracosta.cs113.hw1.assistant;

public class BruteForce {

	public static void main(String[] args) {

		AssistantJack jack = new AssistantJack(0);

		
		int foundMurder = 0;
		int foundWeapon = 0;
		int foundLocation = 0;
		for (int m = 1; m <= TheoryItem.TOTAL_MURDERS; m++) {
			for (int l = 1; l <= TheoryItem.TOTAL_LOCATIONS; l++) {
				for (int w = 1; w <= TheoryItem.TOTAL_WEAPONS;w++) {
					int checkAnswer = jack.checkAnswer(w, l, m);
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
				TheoryItem.getPersonName(foundMurder) + "," + 
				TheoryItem.getLocationName(foundLocation) + "," + 
				TheoryItem.getWeaponName(foundWeapon));
		System.out.println("The correct answer is " + 
				foundMurder + "," + 
				foundLocation + "," + 
				foundWeapon);



	}

}
