package demo;

public class que44 {
	    public static int countZeros(int num) {
	        
	        String numStr = Integer.toString(num);

	        int zeroCount = 0;
	        for (int i = 0; i < numStr.length(); i++) {
	            if (numStr.charAt(i) == '0') {
	                zeroCount++;
	            }
	        }
	        return zeroCount;
	    }

	    public static void main(String[] args) {
	        System.out.println(countZeros(1234)); 
	        System.out.println(countZeros(1230)); 
	    }
	}

