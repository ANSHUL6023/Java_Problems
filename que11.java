package demo;

public class que11 {
	public static boolean countBoolean(boolean a1, boolean a2, boolean a3) {
		if((a1&&a2)||(a1&&a3)||(a2&&a3))
			return true;
		else return false;
	}
	public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;

        System.out.println("For b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3 + ", result = " + countBoolean(b1, b2, b3));

        b1 = true;
        b2 = true;
        b3 = false;

        System.out.println("For b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3 + ", result = " + countBoolean(b1, b2, b3));

        b1 = true;
        b2 = false;
        b3 = false;

        System.out.println("For b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3 + ", result = " + countBoolean(b1, b2, b3));

        b1 = false;
        b2 = false;
        b3 = false;

        System.out.println("For b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3 + ", result = " + countBoolean(b1, b2, b3));
    }
}
