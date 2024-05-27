package demo;

public class que17 {
	    public static String createBoxPattern(int rows, int columns) {
	        if (rows <= 0 || columns <= 0) 
	            return "-1"; 
	        if (rows==0||columns==0)
	        	return "-2";

	        String result = "";
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= columns; j++) {
	                if (i == 1 || i == rows || j == 1 || j == columns) {
	                    result += "* ";
	                } else {
	                    result += "  "; 
	                }
	            }
	            result += "\n";
	        }

	        return result;
	    }

	    public static void main(String[] args) { 
	        System.out.println(createBoxPattern(8, 7));
	    }
}
