package demo;

public class que46 {
	    public static String isKaprekarNumber(int number) {
	        if (number < 0) {
	            return "-1";
	        } else if (number == 0) {
	            return "-2";
	        }
	        long square = (long) number * number;
	        String squareStr = Long.toString(square);
	        int length = squareStr.length();
	   
	        for (int i = 1; i < length; i++) {
	            long firstPart = Long.parseLong(squareStr.substring(0, i));
	            long secondPart = Long.parseLong(squareStr.substring(i));
	            
	            if (firstPart + secondPart == number) {
	                return "True";
	            }
	        }
	       
	        return "False";
	    }

	    public static void main(String[] args) {
	        System.out.println(isKaprekarNumber(9));    // Output: "True"
	        System.out.println(isKaprekarNumber(297));  // Output: "True"
	        System.out.println(isKaprekarNumber(367));  // Output: "False"
	        System.out.println(isKaprekarNumber(-221)); // Output: "-1"
	        System.out.println(isKaprekarNumber(0));    // Output: "-2"
	    }
	}
