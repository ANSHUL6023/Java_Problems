package demo;

public class que7 {
	 static int calculate(int num) {
			if(num<=0) return -1;
			else if (num%2==0)
				return (num*num);
			else return(num*num*num);
		}
		public static void mian(String[] args) {
			int num1 = 4;
	        int num2 = 7;
	        int num3 = 0;

	        System.out.println("For num1 = " + num1 + ", result = " + calculate(num1));
	        System.out.println("For num2 = " + num2 + ", result = " + calculate(num2));
	        System.out.println("For num3 = " + num3 + ", result = " + calculate(num3));
		}
}

