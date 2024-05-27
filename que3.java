package demo;

public class que3 {
	public static int getLeastNum(int num1, int num2) {
		if (num1 < 0 || num2 < 0) return -1; 
	        else if (num1 == 0 || num2 == 0) return -2;
	        	else {
	        		if (num1 < num2) {
	        			return num1;
	        		} else {
	        			return num2;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int num1 = 0;
	        int num2 = 10;
	        int result = getLeastNum(num1, num2);
	        System.out.println("The least number is: " + result);
	    }
}
