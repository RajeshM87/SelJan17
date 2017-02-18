package collections;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicateCountInaList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();

		// Add mentors to the set -- Note the order
		mentors.add("Kader");
		mentors.add("Gopi");
		mentors.add("Nesa");
		mentors.add("Bharath");
		mentors.add("Karim");
		mentors.add("Kader");
		mentors.add("Sakthi");
		
		String checkDuplicates = "Kader";
		int i=0;
		for (String mentor : mentors) {
			
			if(mentor.equals(checkDuplicates)){
				i++;
			}
		}
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
