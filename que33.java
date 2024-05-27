package demo;

import java.util.Scanner;

public class que33 {
		    public static int calculateSum(int n) {
		        if (n <= 0) {
		            return 0; 
		        }

		        int sum = 0;
		        int count = 0;
		        int num =2;
		        
		        while (count < n) {
		            if (num % 3 == 0 && num % 8 == 0) {
		                sum += num; 
		                count++; 
		            }
		            num += 2;
		        }
		        return sum;
		    }
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter an number: ");
		    	System.out.println(que30.calculateSum(sc.nextInt()));
		        
		    }
	}


