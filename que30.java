package demo;

import java.util.Scanner;

public class que30 {
	
	    public static int calculateSum(int n) {
	        if (n <= 0) {
	            return 0; 
	        }

	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 || i % 5 == 0) {
	                sum += i; 
	            }
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter an number: ");
	    	System.out.println(que30.calculateSum(sc.nextInt()));
	        
	    }
}
