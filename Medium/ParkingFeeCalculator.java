import java.util.Scanner;

public class ParkingFeeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalCollection = 0;

        for (int i = 0; i < n; i++) {

            char vehicleType = sc.next().charAt(0);
            int hours = sc.nextInt();

            if (vehicleType == 'C') {

                if (hours <= 2) {
                    totalCollection += hours * 30;
                } else {
                    totalCollection += 2 * 30 + (hours - 2) * 20;
                }

            } else if (vehicleType == 'B') {

                if (hours <= 2) {
                    totalCollection += hours * 15;
                } else {
                    totalCollection += 2 * 15 + (hours - 2) * 10;
                }

            } else if (vehicleType == 'T') {

                if (hours <= 2) {
                    totalCollection += hours * 50;
                } else {
                    totalCollection += 2 * 50 + (hours - 2) * 40;
                }
            }
        }

        System.out.println("Total Collection: " + totalCollection);

        sc.close();
    }
}
