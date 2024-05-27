package demo;

import java.util.Scanner;

public class que20 {
	
	    public static String checkPrime(int number) {
	       
	        if (number <= 1) {
	            return number == 0 || number == 1 ? "-2" : "-1";
	        }

	        
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return "false"; 
	            }
	        }

	        return "true"; 
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter an number: ");
			System.out.println(que20.checkPrime(sc.nextInt()));
	    }
	}
