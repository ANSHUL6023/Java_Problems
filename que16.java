package demo;

public class que16 {
	    public static String getFourPerLine(int value) {
	        if (value < 0) 
	            return "-1"; 
	        
	        if (value == 0) 
	            return "-2"; 
	        
	        if (value > 99)
	            return "-3"; 

	        String result = "";
	        int count = 0;
	        
	        for (int i = 1; i <= value; i++) {
	            result += i + " ";
	            count++;
	           
	            if (count == 4) {
	                result += "\n";
	                count = 0;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        
	        System.out.println(getFourPerLine(20));
	        System.out.println(getFourPerLine(-1)); 
	        System.out.println(getFourPerLine(0));
	        System.out.println(getFourPerLine(100)); 
	    }
}
