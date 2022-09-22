package codeSingal;

import java.util.Arrays;

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

		for (int i = word.length() - 1; i > -1; i--) {
			invertWord += word.charAt(i);
		}
		return invertWord.equals(word);
	}

	public int makeArrayConsecutive2(int[] statues) {
	    int cont = 0;
	    Arrays.sort(statues);
	    for(int i = 0; i < statues.length-1; i++){
	        if((statues[i+1] - statues[i]) != 1){
	            cont = cont + ((statues[i+1] - statues[i])-1) ;        }
	    }
	    return cont;
	}
	
	public boolean almostIncreasingSequence(int [] sequence) {
	    int cont = 0;
	    boolean value = false;
	    for (int i = 0; i < sequence.length-1; i++) {
	            if(sequence[i+1] <= sequence[i]){
	                 cont++;
	                 if(sequence[i+1]>sequence[i-1]) {
	                	 cont = 2;
	                 }
	        }
		}
	    if(cont<2){
	        value = true;
	    } 
	    return value;
	}


}
