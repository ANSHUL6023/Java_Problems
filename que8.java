package demo;

public class que8 {
	
	    public static int sumOfMultiples(int a, int b, int c) {
	        if (a <= 0 || b <= 0 || c <= 0) {
	            return -1; 
	        } else {
	          
	            a = (a % 10 == 0) ? a : ((a / 10) + 1) * 10;
	            b = (b % 10 == 0) ? b : ((b / 10) + 1) * 10;
	            c = (c % 10 == 0) ? c : ((c / 10) + 1) * 10;

	       
	            return a + b + c;
	        }
	    }

	    public static void main(String[] args) {
	        int a = 23;
	        int b = 34;
	        int c = 69;
	        System.out.println("For a = " + a + ", b = " + b + ", c = " + c + ", sum = " + sumOfMultiples(a, b, c));
	    }
	}

