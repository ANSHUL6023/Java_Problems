package demo;

public class que2 {
	public static int getGreatest(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
            return -1; 
        } else if (num1 == 0 || num2 == 0) {
            return -2; 
        } else  {
            return Math.max(num1, num2); // If both numbers are positive, return the greatest
        }
	}
	public static void main(String[] args) {
		int num1 = -5;
        int num2 = 10;
        int result = getGreatest(num1, num2);
        System.out.println("The greatest number is: " + result);
	}
}
