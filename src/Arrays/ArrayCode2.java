package Arrays;
import java.util.Scanner;
 class ArrayOperations  {
	int arr[];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the student count:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array created");
		System.out.println("---------");
	}
		void collectData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter marks of student no:"+(i+1));
				arr[i]=sc.nextInt();
			}
			System.out.println("Data stored into the array");
		
			}
			
		void displayData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("The marks of student no:"+ "is="+arr[i]);
			}
		}
		}
		
	public class ArrayCode2{
		public static void main(String args[]) {
			ArrayOperations a0=new ArrayOperations();
			a0.createArray();
			a0.collectData();
			a0.displayData();
		}
	}
	
	


