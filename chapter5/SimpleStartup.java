import java.util.ArrayList;
import java.util.Collections;
public class SimpleStartup {
	// private int[] locationCells; //DECLARE an int array to hold the location cells. Call it locationCells.
	private ArrayList<Integer> locationCells = new ArrayList<>();
	// private int numOfHits = 0; //DECLARE an int to hold the number of hits. Call it numOfHits and SET it to 0.

	//DECLARE a checkYourself() method that takes a int for the user’s guess (1, 3, etc.), 
	// checks it,
	// and returns a result representing a “hit,” “miss,” or “kill.”
	public String checkYourself(int guess) { 
		for (int locationCell: locationCells) {
			if (locationCell == guess) {
				locationCells.remove(Integer.valueOf(guess));
				if (locationCells.isEmpty()) {
					return "kill";
				}
				else {
					return "hit";
				}
			}
		}
		return "miss";
	}
// 	DECLARE a setLocationCells() setter method that takes an int array (which has the three cell
// locations as ints (2, 3, 4, etc.)).
	public void setLocation(Integer[] cellLocations) {
		// this.locationCells = cellLocations;
		Collections.addAll(locationCells,cellLocations);
		// for (int i = 0; i < cellLocations.length; i++){
		// 	locationCells.add(cellLocations[i]);
		// }
	}
	public ArrayList<Integer> getLocation() {
		return this.locationCells;
	}
}