package demo;

import java.util.Scanner;

public class test {
	/*Question 1*/
	int isEven(int num) {
		if(num % 2 == 0)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		test q1= new test();
		System.out.println(q1.isEven(sc.nextInt()));
	}
	
}
