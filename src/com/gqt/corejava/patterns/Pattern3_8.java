package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub																																																									

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		int n =sc.nextInt();
		
		
		 for (int i = 1; i <= n; i++) {
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  "); 
	            }

	        
	            for (int k = i; k >= 1; k--) {
	            	int asciiValue = k+64;

                    char character = (char) asciiValue;

	                System.out.print(character+" ");
	            }

	        	for(int r=2;r<=i;r++) {
	        		int asciiValue = r+64;

                    char character = (char) asciiValue;

	                System.out.print(character+" ");
				}
				System.out.println();
	           
	         
	        }
	}

}
