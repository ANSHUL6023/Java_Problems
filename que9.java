package demo;

public class que9 {
	    public static int sumOfRoundedValues(int a, int b, int c) {
	        if (a <= 0 || b <= 0 || c <= 0) {
	            return -1; 
	        } else {    
	            a = MultipleOf10(a);
	            b = MultipleOf10(b);
	            c = MultipleOf10(c);
	            return a + b + c;
	        }
	    }
	    private static int MultipleOf10(int num) {
	        int lastDigit = num % 10;
	        if (lastDigit < 5) {
	            return (num / 10) * 10; 
	        } else {
	            return ((num / 10) + 1) * 10; 
	        }
	    }

	    public static void main(String[] args) {
	        int a = 23;
	        int b = 34;
	        int c = 4;
	        System.out.println("For a = " + a + ", b = " + b + ", c = " + c + ", sum = " + sumOfRoundedValues(a, b, c));

	        
	    }
	}
