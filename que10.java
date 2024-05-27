package demo;

public class que10 {
	    public static String ringAlarm(int dayOfWeek, boolean onVacation) {
	        if (dayOfWeek < 0 || dayOfWeek > 6)  return "Invalid Inputs";
	        if (!onVacation && !onVacation)  return "Invalid Inputs";
	        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
	            if (onVacation) {
	                return "10:00";
	            } else {
	                return "07:00";
	            }
	        } else 
	            if (onVacation) {
	                return "OFF";
	            } else {
	                return "10:00";
	            }
	        }
	    

	    public static void main(String[] args) {
	        int day1 = 1; 
	        int day2 = 6; 
	        boolean onVacation1 = true;
	        boolean onVacation2 = false;

	        System.out.println("When on vacation, Monday: " + ringAlarm(day1, onVacation1)); 
	        System.out.println("Not on vacation, Saturday: " + ringAlarm(day2, onVacation2));
	    }
	}


