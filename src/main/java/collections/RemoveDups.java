package collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class RemoveDups {

	public static void main(String[] args) {

		// Lets write Psuedocode first
		// Goal ?? If there is repeating character -- then print false ; else true

		// 1, Convert the string to the character array(toCharArray())
		// 2, Loop through each character (use foreach)
		// 3, If the character is in map key then print duplicate and break
		// 4, If not add to the map

		int[] data = {1,2,3,4,2,4};

		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		int[] uniqueChars = new int[data.length];
		int j = 1;
		uniqueChars[0]=data[0];
		for (int i = 1; i < data.length; i++) {
			if(data[i-1] != data[i]){
				uniqueChars[j]=data[i];
				j++;							
			}
		}
		int[] uChars = Arrays.copyOf(uniqueChars, j);
		for (int i = 0; i < uChars.length; i++) {
			System.out.println(uChars[i]);
		}	}








}
