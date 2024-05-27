package demo;

public class que50 {
	
	    public static int getGCD(int num1, int num2) {
	        if (num1 < 0 || num2 < 0) {
	            return -1;
	        }
	        
	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }
	        
	        return num1;
	    }

	    public static void main(String[] args) {
	        System.out.println(getGCD(20, 30));    
	        System.out.println(getGCD(-10, 30));   
	        System.out.println(getGCD(123, 345)); 
	    }
	}
