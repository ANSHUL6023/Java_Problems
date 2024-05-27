package demo;

public class que31 {
    public static int calculateDifference(int n) {
        if (n <= 0) {
            return 0;
        }
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }
        int sum = n * (n + 1) / 2; 
        int squareOfSum = sum * sum;
        int difference = sumOfSquares - squareOfSum;
        return difference;
    }
    public static void main(String[] args) {
        System.out.println(calculateDifference(10));
    }
}
