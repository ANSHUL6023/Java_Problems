package demo;

public class que41 {
	    public static int getProduct(int num1, int num2) {
	        if (num1 <= 0 || num2 <= 0) {
	            return -1;
	        }
	        int halving = num1;
	        int doubling = num2;
	        int product = 0;
	        while (halving > 0) {
	            if (halving % 2 != 0) {
	                product += doubling;
	            }
	            halving /= 2;
	            doubling *= 2;
	        }

	        return product;
	    }
	    public static void main(String[] args) {
	        System.out.println(getProduct(11, 12));  // Output: 132
	    }
}
