package demo;

public class que19 {
	 public static String NumberPattern4(int rows) {
	        if (rows <= 0) {
	            return "-1"; 
	        }

	        String result = "";
	        int count = 1;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                result += count + " "; 
	                count += i; 
	            }
	            result += "\n"; 
	            count = i + 1; 
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        System.out.println(NumberPattern4(7));
	    }
}
