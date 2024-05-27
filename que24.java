package demo;

public class que24 {
	    public static String getFactors(int num) {
	        if (num < 0) {
	            return "-1";
	        } else if (num == 0) {
	            return "-2";
	        } else {
	            String factors = "";
	            for (int i = 1; i <= num; i++) {
	                if (num % i == 0) {
	                    factors += i + " ";
	                }
	            }
	            return factors;
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println(getFactors(28));
	    }
}
