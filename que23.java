package demo;

import java.util.Scanner;

public class que23 {
	
	    public static int getFactorial(int num) {
	        if (num < 0) {
	            return -1;
	        }
	        else if (num == 0) {
	            return -2;
	        }
	        else {
	            int factorial = 1;
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            return factorial;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value: ");
	    	System.out.println(que23.getFactorial(sc.nextInt())); 
	    }
}
