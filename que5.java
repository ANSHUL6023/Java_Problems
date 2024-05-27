package demo;

import java.util.Scanner;

public class que5 {
	 int findSign(int num) {
	if (num==0) return 0;
	else if (num>0) return 1;
	else return -1;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		que5 A= new que5();
		System.out.println(A.findSign(sc.nextInt()));
}

}
