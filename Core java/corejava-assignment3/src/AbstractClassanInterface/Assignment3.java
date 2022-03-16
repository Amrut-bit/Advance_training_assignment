package AbstractClassanInterface;

import java.util.Random;

public class Assignment3 {

	public static void main(String[] args) {
Instrument[] instruments = new Instrument[10];
		
		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		instruments[i] = new Paino();
	    	else if (randomNum == 2)
	    		instruments[i] = new Fulte();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	
	    	instruments[i].play();
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Paino) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Fulte) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}

}
