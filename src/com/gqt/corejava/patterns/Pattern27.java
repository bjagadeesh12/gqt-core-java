package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
		
			for(int k =i;k< n;k++) {
				System.out.print("	");
			}
			for(int j=1;j<=(2*i-1);j++) {
				
				System.out.print(j+"	");
			
				
					
				}
				
			
			System.out.println();
		}


	}}


