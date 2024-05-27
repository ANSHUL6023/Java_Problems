package demo;

public class que49 {
	    public static int convertMMMtoMM(String month) {
	     
	        String lowercaseMonth = month.toLowerCase();
	        
	        switch (lowercaseMonth) {
	            case "jan":
	            case "january":
	                return 1;
	            case "feb":
	            case "february":
	                return 2;
	            case "mar":
	            case "march":
	                return 3;
	            case "apr":
	            case "april":
	                return 4;
	            case "may":
	                return 5;
	            case "jun":
	            case "june":
	                return 6;
	            case "jul":
	            case "july":
	                return 7;
	            case "aug":
	            case "august":
	                return 8;
	            case "sep":
	            case "september":
	                return 9;
	            case "oct":
	            case "october":
	                return 10;
	            case "nov":
	            case "november":
	                return 11;
	            case "dec":
	            case "december":
	                return 12;
	            default:
	                return -1;
	        }
	    }

	    public static void main(String[] args) {
	       
	        System.out.println(convertMMMtoMM("Mar"));    
	        System.out.println(convertMMMtoMM("MAR"));    
	        System.out.println(convertMMMtoMM("MARCH")); 
	        System.out.println(convertMMMtoMM("March"));
	        System.out.println(convertMMMtoMM("MaRcH"));  
	        System.out.println(convertMMMtoMM("ABC"));    
	    }
	}