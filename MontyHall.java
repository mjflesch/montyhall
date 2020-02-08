import java.util.*;


public class MontyHall {

	public static void main(String[] args) {
		
	int victory = 0;
	int victorySwitch =0;
	final int num = 10000000;
	
	for (int i=0; i<num; i++) {
		
		boolean winner = false;
		
		// Declare 3 doors - all initialized to be false (losers)
		boolean[] doors = new boolean[3];
		
		// Randomly select one of the three doors to be winner and other 2 losers
		Random rand = new Random();
		int pos = rand.nextInt(3);
		// Set one door to be winner
		doors[pos]=true;
		
		// Have player randomly select one of the doors
		int choice = rand.nextInt(3);
	
		// Case 1 - Player does not switch
		// Check if choice is winner
		if (doors[choice]==true) {
			winner = true;
			victory++;
		}
		
		// Case 2
		// Have the player switch after host opens one door
		if (doors[choice]==true) {
			winner = false;
		}
		else if (doors[choice] == false) {
			winner = true;
			victorySwitch++;
		}
		
	}	
	System.out.println("We simulated " + num + " games.");
	System.out.print("The person who didn't switch wins: ");
	System.out.print(victory);
	System.out.println();
	System.out.print("The person who switches wins: ");
	System.out.print(victorySwitch);
	}

}
