import java.util.Scanner;

public class TrafficSignalSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int queue = 0;
        int totalPassed = 0;

        for (int i = 1; i <= n; i++) {

            char signal = sc.next().charAt(0);
            int vehiclesWaiting = sc.nextInt();

            queue += vehiclesWaiting;

            int allowed = 0;

            if (signal == 'R') {
                allowed = 0;
            } else if (signal == 'Y') {
                allowed = 2;
            } else if (signal == 'G') {
                allowed = 10;
            }

            int passed = Math.min(queue, allowed);

            queue -= passed;
            totalPassed += passed;

            System.out.println(
                "Cycle " + i +
                ": Passed = " + passed +
                ", Remaining = " + queue
            );
        }

        System.out.println("Total Passed: " + totalPassed);
        System.out.println("Final Queue: " + queue);

        sc.close();
    }
}
