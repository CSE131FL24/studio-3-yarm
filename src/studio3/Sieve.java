package studio3;

import java.util.Scanner;

public class Sieve {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrayLength = in.nextInt();
		
		boolean[] myArray = new boolean[arrayLength];
		
		for (int i = 1; i<arrayLength;i++) {
			myArray[i] = true;
			
		}
		
		for (int k = 2; k<Math.sqrt(arrayLength); k++) {
			if (myArray[k] == true) {
			int number = k*2;
			
				while (number<arrayLength) {
					
					myArray[number]=false;
					number += k;
		}
				
	}
			

}
		for (int l = 1; l<arrayLength;l++) {
			if (myArray[l] == true) {
			System.out.print(l+", ");
			}
			
		}
	}
}