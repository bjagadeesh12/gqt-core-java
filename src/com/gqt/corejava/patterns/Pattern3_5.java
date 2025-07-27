package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n =sc.nextInt();
		
//		int m=1;
		
		for(int i =1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("	");
				
			}
			int m=1;
			for(int k =1;k <= (2*i-1);k++) {
			
				System.out.print(m+"	");
				m++;
			}
			
			System.out.println();
		}
		
	}

}
