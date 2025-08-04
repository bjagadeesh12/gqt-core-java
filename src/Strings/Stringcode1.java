package Strings;

public class Stringcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		System.out.println("Case-1: Same Strings");
		if(s1.equals(s2)==true) {
			System.out.println("String equals");
		}
		else {
			System.out.println("Strings not equal");
		
		}
		System.out.println("-------------");
		if(s1==s2) {
			System.out.println("References equals");
		}
		else {
			System.out.println("References not equals");
		
			
		}
		System.out.println("===============");
		System.out.println("Case-2: DIFFERENT Strings");
		if(s1.equals(s4)==true) {
			System.out.println("String equals");
		}
		else {
			System.out.println("Strings not equal");
		
		}
		System.out.println("-------------");
		if(s1==s4) {
			System.out.println("References equals");
		}
		else {
			System.out.println("References not equals");
		
			
		}
		System.out.println("===============");
		
		System.out.println("Case-3: Same Strings BUT different case");
		if(s1.equals(s3)==true) {
			System.out.println("String equals");
		}
		else {
			System.out.println("Strings not equal");
		
		}
		System.out.println("-------------");
		if(s1==s2) {
			System.out.println("References equals");
		}
		else {
			System.out.println("References not equals");
		
			
		}
		System.out.println("===============");
	}

}
