/**
 * 
 */

package ConditionalStatements;


import java.util.Scanner;

/**
 * 
 */
public class myname {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n = sc.nextInt();
//		int n = 11;
		
		System.out.println();
		
		for(int i =0; i<n; i++) {
			
			
			//J
			for(int j=0; j<n; j++) {
				if( i==0 || i==n-1 && j<=5 || j==n/2 || j==0 && i>=5 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			//G
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 && j<=n/2 || j == n/2 && i>=5 || i==n/2 && j>=5 || j==n-1 && i>=5 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			//D
			for(int j=0; j<n; j++) {
				if(i==0 && j!=n-1 || i==n-1 && j!=n-1 || j==0 || j==n-1 && i!=n-1 && i!=0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			//E
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
		
			
			//E
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
		
			
			//S
			for(int j=0; j<n; j++) {
				if( j ==0 && i<=n/2 || i ==0 || i == n/2 || j == n-1 && i >=5 || i == n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			
			//H
			for(int j=0; j<n; j++) {
				if(j==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
			

			
		}
		sc.close();

	}

}