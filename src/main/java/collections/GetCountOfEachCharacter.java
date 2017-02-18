package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCountOfEachCharacter {

	public static void main(String[] args) {

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String

		String date = "amazon";
		
		
		
		
		
		
		
		

		char[] allChars= date.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char c : allChars) {

			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
				
			}else{
				map.put(c, 1);
			}
		}
		

		System.out.println(map);
	}


	// Class room Session.. [Psuedo Code] 
	// In a given String, find the most number of repeating character



}


