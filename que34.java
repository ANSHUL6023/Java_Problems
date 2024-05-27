package demo;

public class que34 {
	    public static int findSum(int number) {
	        if (number < 0) {
	            return 0; 
	        }

	        int sum = 0;
	        while (number > 0) {
	            int digit = number % 10; 
	            sum += digit * digit * digit; 
	            number /= 10;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        System.out.println(findSum(123)); 
	    }
}
