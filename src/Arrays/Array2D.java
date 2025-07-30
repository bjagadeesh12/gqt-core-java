package Arrays;

import java.util.Scanner;

class ArrayOperation{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter the class count : ");
		int cls = sc.nextInt();
		System.out.println("Enter student count in each class:");
		int stu=sc.nextInt();
		
	
		
		arr = new String[cls][stu];
		
		
		
		
		System.out.println("Array Created");
		System.out.println("----------------");
	}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the name of student no: "+(j+1));
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Data Collected");
		System.out.println("-------------");
	}
	
	void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class no :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("the student name no "+(j+1)+" is= "+arr[i][j]);
				
			}
		}
		System.out.println("------");
	}
}

public class Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation ao = new ArrayOperation();
		ao.createArray();
		ao.collectData();
		ao.displayData();

	}

}