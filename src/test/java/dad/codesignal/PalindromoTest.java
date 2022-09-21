package dad.codesignal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import codeSingal.TheJourneyBegins;

public class PalindromoTest {

	private TheJourneyBegins tjb;

	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();

	}
	
	
	@Test
	public void test4() {
		assertTrue(tjb.palindromo("acca"));
	}
	
	@Test
	public void test5() {
		assertFalse(tjb.palindromo("hola"));
	}
}
