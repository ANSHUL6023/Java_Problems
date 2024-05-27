package demo;

public class que45 {
	    public static boolean isAdamNumber(int num) {
	        int squareNum = num * num;
	        int reverseSquareNum = reverseNumber(squareNum);
	        int reverseNum = reverseNumber(num);

	        int squareReverseNum = reverseNum * reverseNum;

	        return squareReverseNum == reverseSquareNum;
	    }
	    public static int reverseNumber(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return reversedNum;
	    }

	    public static void main(String[] args) {
	     
	        System.out.println(isAdamNumber(121)); 
	        System.out.println(isAdamNumber(17));   
	    }
}
