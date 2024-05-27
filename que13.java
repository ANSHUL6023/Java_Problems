package demo;

public class que13 {
	    public static String getNumbersInRange(int start, int end) {
	        if (start < 0 || end < 0) return "-1";
	        if (start == end) return "-2"; 
	        if (start > end) return "-3";

//	        StringBuilder result = new StringBuilder();
	        String numbers = "";
	        numbers += start;
	        for (int i = start + 1; i < end; i++) {
	        	 numbers += " " + i;
	        }

	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        System.out.println(getNumbersInRange(1, 5)); // Output: "2 3 4"
	        System.out.println(getNumbersInRange(10, 15)); // Output: "11 12 13 14"
	        System.out.println(getNumbersInRange(-1, 5)); // Output: "-1"
	        System.out.println(getNumbersInRange(5, 5)); // Output: "-2"
	        System.out.println(getNumbersInRange(7, 5)); // Output: "-3"
	    }
	}

