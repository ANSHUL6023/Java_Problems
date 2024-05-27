package demo;

public class que36 {
	    public static int getPrimeSum(int n) {
	        if (n <= 0) {
	            return 0; 
	        }

	        int sum = 0;
	        int count = 0;

	        for (int i = 2; count < n; i++) {
	            if (isPrime(i)) {
	                sum += i;
	                count++;
	            }
	        }

	        return sum;
	    }
	    private static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        System.out.println(getPrimeSum(5));  
	    }
}
