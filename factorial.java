import java.util.Scanner;

// recursion function finding factorial
class Factorial {
    public static int factcal(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int fact_1 = factcal(n - 1);
        int fact = n * fact_1;
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find rhe factorial of the number : ");
        int n = in.nextInt();
        // int n = 6;
        int ans = factcal(n);
        System.out.println("Factorial of number is : " + ans);
    }
}
