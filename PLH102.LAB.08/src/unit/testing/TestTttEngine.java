package unit.testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import engine.TttEngine;

public class TestTttEngine {
	
	@Test
	public void testGetRandomValue() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(TttEngine.getRandomValue());
			assertTrue(TttEngine.getRandomValue() < 4 && TttEngine.getRandomValue() > -1);
		}
	}
	
}
