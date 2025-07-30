/**
 * 
 */
package ConditionalStatements;

import java.util.Scanner;

/**
 * - - - - $ 
 *- - - $ $ $ 
 *- - $ $ $ $ $ 
 *- $ $ $ $ $ $ $ 
 *@author jagadeesh
 *@description 

 */
public class c3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=1;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
					
			}
		
			System.out.println();
				
			}
		}
	
	}




