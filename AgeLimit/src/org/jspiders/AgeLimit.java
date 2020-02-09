package org.jspiders;

import java.util.Scanner;

public class AgeLimit {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your AGE");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if(i<22)
			System.out.println("Study Hard");
		if(i>=22 && i<=26)
			System.out.println("Find a JOB");
		if(i>27 && i<=50)
			System.out.println("WORK like a DONkey");
		if(i>50)
			System.out.println("Settle in HIMALAYAS**enjoy**");
	}

}
