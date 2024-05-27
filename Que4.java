package demo;

import java.util.Scanner;

public class Que4 {
	public static int oddRounder(int num) {
		if (num < 0 ) return -1; 
        else if (num == 0 ) return -2;
        else {
        	if (num % 2 == 0)
        		return num;
        	else return (num / 10 + 1) * 10;
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		Que4 q4= new Que4();
		System.out.println(Que4.oddRounder(sc.nextInt()));
}
}