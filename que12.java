package demo;

public class que12 {
	public static String getNaturalNumbers(int start, int end) {
		if (start < 0 || end < 0)  return "-1"; 
        if (start == 0 || end == 0) return "-2";
        
        String numbers = "";
        numbers += start;
        for (int i = start + 1; i <= end; i++) {
            numbers += " " + i;
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(getNaturalNumbers(1, 5));
        System.out.println(getNaturalNumbers(-1, 5)); 
    }

}
