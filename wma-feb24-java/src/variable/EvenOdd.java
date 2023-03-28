package variable;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
//	int number=10;
//	if(number%2==0) {
//		System.out.println(number +" is even");
//	}else {
//		System.out.println(number +" is odd");
//	}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number ");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num +" is even");
		}else {
			System.out.println(num +" is odd");
			}
				
	}

}
