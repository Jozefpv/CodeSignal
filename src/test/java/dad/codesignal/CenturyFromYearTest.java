package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import codeSingal.TheJourneyBegins;

public class CenturyFromYearTest {

	private TheJourneyBegins tjb;

	@Before
	public void setup() {
		tjb = new TheJourneyBegins();

	}

	@Test
	public void test2() {
		assertEquals(17, tjb.centuryFromYear(1700));
	}

	@Test
	public void test3() {
		assertEquals(21, tjb.centuryFromYear(2001));
	}
}
