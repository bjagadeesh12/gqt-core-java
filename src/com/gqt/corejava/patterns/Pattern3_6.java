package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=2*i-1; k>=1; k--) {
				int ascii = k+64;
				char value= (char) ascii;
				System.out.print(value);
				
			}
			
			System.out.println();
		}
		

	}

}
