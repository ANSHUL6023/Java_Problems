package demo;

import java.util.Scanner;

public class que25 {
	    public static int getSumOfFactors(int num) {
	        if (num < 0) {
	            return -1;
	        } else if (num == 0) {
	            return -2;
	        } else {
	            int sum=0;
	            for (int i = 1; i <= num; i++) {
	                if (num % i == 0) {
	                    sum += i;
	                }
	            }
	            return sum;
	        }
	    }
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the value: ");
	        System.out.println(que25.getSumOfFactors(sc.nextInt()));
	    }
}
