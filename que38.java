package demo;

public class que38 {
	    public static String getSum(double number) {
	        int integerPart = (int) number;
	        double fractionalPart = number - integerPart;

	        int leftSum = sumDigits(integerPart);

	        int rightSum = sumDigits((int) (fractionalPart * 100)); 
	        return leftSum + ":" + rightSum;
	    }

	    private static int sumDigits(int num) {
	        int sum = 0;
	        while (num > 0) {
	            sum += num % 10; 
	            num /= 10;   
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        System.out.println(getSum(120.520));    
	    }
	}
