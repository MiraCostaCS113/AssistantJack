package edu.miracosta.cs113.hw1.assistant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.miracosta.cs113.hw1.assistant.AssistantJack;

public class AssistantJackTester {

	@Test
	public void testCheckAnswerIntIntInt() {
		AssistantJack aj = new AssistantJack(1);
		assertTrue(aj.checkAnswer(1, 1, 1) == 0);		
	}

	@Test
	public void testCheckAnswer2() {
		AssistantJack aj = new AssistantJack(2);
		assertTrue(aj.checkAnswer(6,10,6) == 0);
	}

}
