package cs113_Lewis_Kevin;

import java.util.ArrayList;
import java.util.Random;

public class AssistantJack {
	
	private int timesAsked;
	private boolean foundAnswer;
	private Theory correctTheory;
	
	private AssistantJack()
	{
		this.timesAsked = 0;
		this.foundAnswer = false;
		this.correctTheory = null;
	}
	
	public AssistantJack(int answerSet) {
		this();
		if(answerSet == 1) {
			this.correctTheory = new Theory(1,1,1);
		}
		else if (answerSet == 2) {
			this.correctTheory = new Theory(6, 10, 6);
		}
		else {
			Random random = new Random();
			int weapon = random.nextInt(6) + 1;
			int location = random.nextInt(10) + 1;
			int person = random.nextInt(6) + 1;
			this.correctTheory = new Theory(weapon, location, person);
		}
	}
	
	public AssistantJack(Theory theory) {
		this();
		this.correctTheory = new Theory(theory);
	}
	
	public int checkAnswer(int weapon, int location, int person) {
		ArrayList<Integer> wrongItems = new ArrayList<Integer>();
		
		
		if(this.correctTheory.getWeapon() != weapon) {
			wrongItems.add(1);
		}
		
		if(this.correctTheory.getLocation() != location) {
			wrongItems.add(2);
		}
		
		if(this.correctTheory.getPerson() != person) {
			wrongItems.add(3);
		}
		
		if(wrongItems.size() == 0) {
			return 0;
		}
		else if (wrongItems.size() == 1) {
			return wrongItems.get(0);
		}
		else {
			Random random = new Random();
			return wrongItems.get(random.nextInt(wrongItems.size()));			
		}
	}
	
	public int checkAnswer(Theory theory) {
		return this.checkAnswer(theory.getWeapon(), 
				theory.getLocation(), theory.getPerson());
	}
}
