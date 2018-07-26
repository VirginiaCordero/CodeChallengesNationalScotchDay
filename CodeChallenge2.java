/* Challenge by Andrew Foley and Virginia Cordero */

import java.util.ArrayList;
import java.util.HashMap;

public class CodeChallenge2 {

	public static void main(String[] args) {
		/*
		 * Code Challenge 2: Maps* Create Map with String keys and Integer values. Write
		 * a method that will increment the value at a given key or, if there is no
		 * value at that key yet, set it to 1. Call this method for these keys: “A”,
		 * “B”, “A”, “C”, “B”, “B”. [ A -> 2, B -> 3, C -> 1 ] Then print the map (just
		 * use sysout(leMap). Bonus: Allow user to input keys in a loop until they do
		 * not want to continue.
		 */
		
		// Declare a HashMap
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		
		
		// Initialize an ArrayList of random "keys" to loop through later
		ArrayList<String> keyList = new ArrayList<String>();
		keyList.add("A");
		keyList.add("B");
		keyList.add("A");
		keyList.add("C");
		keyList.add("B");
		keyList.add("B");
		keyList.add("D");
		keyList.add("D");
		keyList.add("Z");
		
		// Call updateMap for each key in the keyList
		// Enhanced for-loop
		for (String specificKey: keyList) {
			updateMap(myMap, specificKey);
		}
		
		// Looped through each key in myMap.keySet() -- which is just a set of all the keys in myMap
		for (String specificKey : myMap.keySet()) {
			Integer value = myMap.get(specificKey);	
			System.out.println(specificKey + " showed up " + value + " times.");
		}
		
		// Easier print method
		System.out.println(myMap);
		
	}
	
	
	public static void updateMap(HashMap<String, Integer> originalMap, String keyLetter) {		
		Integer value = originalMap.get(keyLetter);
		
		if (value != null) {
			// the key exists!
			// update the map by replacing key: value with key: value + 1
			// i.e. increment a counter
			originalMap.put(keyLetter, value + 1);
		} else {
			// the key did not exist ...
			// create a new "Entry" for that key with a value of 1 (just to start the count)
			originalMap.put(keyLetter, 1);
		}
		
		// At this point the originalMap was updated
		
	}

}
