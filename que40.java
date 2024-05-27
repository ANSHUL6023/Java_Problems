package demo;

public class que40 {
	public static boolean checkPalindrome(int num) {
		int originalNum = num;
		int palidromeNum = 0;
		
		while(num>0) {
			int digit = num % 10;
			palidromeNum = palidromeNum * 10 + digit;
			num /= 10;
		}
		return originalNum == palidromeNum;
	}
	 public static void main(String[] args) {
	        System.out.println(checkPalindrome(12321));
	    }
}
