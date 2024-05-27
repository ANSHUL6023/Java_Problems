package demo;

public class que27 {
	    public static String findTriangle(int side1, int side2, int side3) {
	        if (side1 == 0 || side2 == 0 || side3 == 0) {
	            return "-1";
	        } 
	        else if (side1 < 0 || side2 < 0 || side3 < 0) {
	            return "-2";
	        } 
	        else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
	            return "-3";
	        }
	        else {
	            if (side1 == side2 && side2 == side3) {
	                return "EQUILATERAL";
	            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
	                return "ISOSCELES";
	            } else {
	                return "SCALENE";
	            }
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println(findTriangle(3, 3, 3));   
	        System.out.println(findTriangle(3, 4, 4)); 
	        System.out.println(findTriangle(3, 4, 5));   
	        System.out.println(findTriangle(0, 4, 5));  
	        System.out.println(findTriangle(-3, 4, 5));  
	        System.out.println(findTriangle(1, 2, 4));  
	    }
}
