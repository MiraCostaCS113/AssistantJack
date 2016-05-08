package edu.miracosta.cs113.hw1.assistant;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lewiske
 * 
 * The assisntant jack class will be asked various theories but Detective Jill he will then refute the answer or will accept the 
 * answer.  If he refutes the answer he will notify you of 1 part of your theory that is incorrect.  Your job is to ask
 * your assistant jack less that 20 times.  
 *
 */
public class AssistantJack {
	
	private int timesAsked;
	private Theory correctTheory;
	
	/**
	 * The default constructor but will not be called from outside. 
	 */
	private AssistantJack()
	{
		this.timesAsked = 0;
		this.correctTheory = null;
	}
	
	/**
	 * The assistant to use.
	 * 
	 * @param answerSet 1 is a fixed answer of 1,1,1 and 2 is a fixed answer of 6,10,6 any other integer will be randomly assigned
	 */
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
	
	/**
	 * Creates an assistant Jack with a theory that was passed in. 
	 * 
	 * @param theory
	 */
	public AssistantJack(Theory theory) {
		this();
		this.correctTheory = new Theory(theory);
	}
	
	/**
	 * Will report to the user whether there theory works or not.  It will return a number 
	 * that needs to be interpreted. 
	 * 
	 * @param weapon the weapon used 1 - 6
	 * @param location the location done 1 - 10
	 * @param person the person who did it 1 -6
	 * @return 0 if all there are correct, 1 if the weapon is incorrect, 2 if the location is incorrect and 3 if the person is 
	 * incorrect, if multiple are incorrect it will randomly select one. 
	 */
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
	
	/**
	 * Pass through method that converts the theory to numbers and sends it to the 
	 * overloaded method.
	 * 
	 * @param theory a theory of the murder, weapon and location
	 * @see AssistantJack.checkAnswer
	 */
	public int checkAnswer(Theory theory) {
		return this.checkAnswer(theory.getWeapon(), 
				theory.getLocation(), theory.getPerson());
	}
}
