package demo;

public class que48 {
	public class Main {
	    public static int sumOfAmicablePairs() {
	        int sum = 0;
	        for (int i = 1; i <= 1000000; i++) {
	            int pair = getSumOfProperDivisors(i);
	            if (pair > i && getSumOfProperDivisors(pair) == i) {
	                sum += i + pair;
	            }
	        }
	        return sum;
	    }

	    public static int getSumOfProperDivisors(int number) {
	        int sum = 1; // Start with 1 as 1 is always a divisor
	        int sqrt = (int) Math.sqrt(number);
	        for (int i = 2; i <= sqrt; i++) {
	            if (number % i == 0) {
	                sum += i;
	                int divisor = number / i;
	                if (divisor != i) {
	                    sum += divisor;
	                }
	            }
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        System.out.println(sumOfAmicablePairs());
	    }
	}

}

/******sumOfAmicablePairs() iterates through numbers from 1 to 1 million and checks if a number and its pair form an amicable pair.
getSumOfProperDivisors() calculates the sum of proper divisors for a given number. 
It iterates through numbers up to the square root of the given number and adds up the divisors.*******/