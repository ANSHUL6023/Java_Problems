package demo;

public class que6 {
	    public static String isEvenOrOdd(int number) {
	        if (number <= 0) {
	            return "Invalid Input"; 
	        } else {
	            if (number % 2 == 0) {
	                return "Even"; 
	            } else {
	                return "Odd"; 
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int num1 = 4;
	        System.out.println("For num1 = " + num1 + ", result = " + isEvenOrOdd(num1));
	    }
	}


