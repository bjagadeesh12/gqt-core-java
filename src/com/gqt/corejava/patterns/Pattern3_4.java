package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		 int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {//5
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }

        
            for (int k = 1; k <= i; k++) {
                System.out.print(i+ " ");
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(i + " ");
            }
          

            System.out.println(); 

	}

}}
