package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the value:");
		int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }

            for (int k = 1; k <= i; k++) {
            	int asciiValue = i+64;
                char character = (char) asciiValue;
                System.out.print(character+" ");
            }

            for (int k = i - 1; k >= 1; k--) {
            	int asciiValue = i+64;
                char character = (char) asciiValue;
                System.out.print(character+ " ");
            }
      
            System.out.println(); 
        }
       

	}

}
