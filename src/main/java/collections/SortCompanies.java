package collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortCompanies {

	public static void main(String[] args) {
		
		String[] companies =
			{"TCS", "Infosys", "Aspire", "CTS"};
		
		Arrays.sort(companies);
		for (int i = companies.length - 1; i >=0 ; i--) {
			System.out.println(companies[i]);
		}
		
		Set<String> comp = new TreeSet<String>();
		comp.add("TCS");
		comp.add("Infosys");
		comp.add("Aspire");
		comp.add("CTS");
		System.out.println(comp);
		
		
	}
}








