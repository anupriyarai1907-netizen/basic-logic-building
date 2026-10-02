import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        int bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = 100 * 5 + (units - 100) * 7;
        } 
        else if (units <= 400) {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        } 
        else {
            bill = 100 * 5 + 100 * 7 + 200 * 10 + (units - 400) * 15;
        }

        System.out.println(bill);

        sc.close();
    }
}
