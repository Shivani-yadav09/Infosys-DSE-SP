import java.util.Scanner;
public class Consecutive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0] + arr[1];

        for (int i = 0; i < n - 1; i++) {

            int sum = arr[i] + arr[i + 1];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);

        sc.close();
    }
}