
/**
 * 
 */
package ConditionalStatements;

import java.util.Scanner;

/**
 * # # # # # 
 * # - - - # 
 * # - - - # 
 * # - - - # 
 * # # # # # 
 * 
 * 
 * @author jagadeesh
 * @category patterns
 * @description This is an example for conditional pattern
 */
public class c1 {

	/**
	 * @param args
	 * description this contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				
				}
				
			}System.out.println();
		}
		sc.close();
		

		
	}

}
