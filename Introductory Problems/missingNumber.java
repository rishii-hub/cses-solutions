import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextLong();
        }
        long actualSum = n * (n + 1) / 2;
        System.out.println(actualSum - sum);
        sc.close();
    }
}
