import java.util.Scanner;

public class SmartGroceryCheckout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double subtotal = 0;

        for (int i = 0; i < n; i++) {

            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            subtotal += price * quantity;
        }

        double discountRate;

        if (subtotal < 1000) {
            discountRate = 0;
        } else if (subtotal < 5000) {
            discountRate = 0.05;
        } else if (subtotal < 10000) {
            discountRate = 0.10;
        } else {
            discountRate = 0.15;
        }

        double discount = subtotal * discountRate;

        double discountedAmount = subtotal - discount;

        double tax = discountedAmount * 0.05;

        double finalAmount = discountedAmount + tax;

        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Final Amount: %.2f%n", finalAmount);

        sc.close();
    }
}
