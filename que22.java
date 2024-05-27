package demo;

public class que22 {
	    public static String checkArmStrong(int num) {
	        if (num < 0) {
	            return "-1";
	        } else if (num < 1000 || num > 9999) {
	            return "-2";
	        } else {
	            int sum = 0;
	            int temp = num;
	            while (temp > 0) {
	                int digit = temp % 10;
	                sum += Math.pow(digit, 4);
	                temp /= 10;
	            }
	            if (sum == num) {
	                return "ArmStrong Number";
	            } else {
	                return "Not ArmStrong Number";
	            }
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(checkArmStrong(1634));  
	    }
}
