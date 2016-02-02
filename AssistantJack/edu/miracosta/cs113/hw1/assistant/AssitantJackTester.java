package edu.miracosta.cs113.hw1.assistant;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssitantJackTester {

	@Test
	public void testAssistantJackInt() {
		AssistantJack jack = new AssistantJack(1);
		if(jack.checkAnswer(1,1,1)  != 0)
		{
			fail("Incorrect Answer for answer set 1.");
		}
		jack = new AssistantJack(2);
		
		if(jack.checkAnswer(6,10,6) != 0)
		{
			fail("Incorrect Answer for answer set 2.");
		}
				
	}

	@Test
	public void testCheckAnswerIntIntInt() {
		AssistantJack jack = new AssistantJack(1);
		if(jack.checkAnswer(1,2,1)  != 1)
		{
			fail("Incorrect return value");
		}
		
		
	}

}
