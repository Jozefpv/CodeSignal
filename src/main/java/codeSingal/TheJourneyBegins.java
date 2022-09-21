package codeSingal;

public class TheJourneyBegins {
	public int add(int a, int b) {
		return a + b;
	}

	public int centuryFromYear(int year) {
		int century;
		if (year % 100 == 0) {
			century = (year / 100);
		} else {
			century = (year / 100) + 1;
		}
		return century;

	}

	public boolean palindromo(String word) {
		String invertWord = "";
		
		for (int i = word.length()-1; i > -1; i--) {
			invertWord += word.charAt(i);
		}
		return invertWord.equals(word);
	}
}
