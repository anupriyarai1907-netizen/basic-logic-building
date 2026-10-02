import java.util.Scanner;

public class DigitalSumAndProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;

            sum = sum + digit;
            product = product * digit;

            n = n / 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        if (sum % 3 == 0) {
            System.out.println("Divisible by 3: Yes");
        } else {
            System.out.println("Divisible by 3: No");
        }

        sc.close();
    }
}
