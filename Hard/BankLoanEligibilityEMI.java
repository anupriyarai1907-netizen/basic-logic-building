import java.util.Scanner;

public class BankLoanEligibilityEMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double existingEMI = sc.nextDouble();
        int creditScore = sc.nextInt();
        double loanAmount = sc.nextDouble();
        double annualInterest = sc.nextDouble();
        int months = sc.nextInt();

        boolean eligible = salary >= 25000
                && creditScore >= 700
                && existingEMI <= 0.40 * salary;

        if (!eligible) {
            System.out.println("Loan Status: NOT ELIGIBLE");
            sc.close();
            return;
        }

        double maximumEMI = 0.50 * salary - existingEMI;

        double monthlyRate = annualInterest / (12 * 100);

        double estimatedEMI;

        if (monthlyRate == 0) {
            estimatedEMI = loanAmount / months;
        } else {
            estimatedEMI = loanAmount * monthlyRate
                    * Math.pow(1 + monthlyRate, months)
                    / (Math.pow(1 + monthlyRate, months) - 1);
        }

        System.out.println("Loan Status: ELIGIBLE");
        System.out.printf("Maximum EMI: %.2f%n", maximumEMI);
        System.out.printf("Estimated Monthly EMI: %.2f%n", estimatedEMI);

        if (estimatedEMI > maximumEMI) {
            System.out.println(
                "Requested loan amount cannot be approved under the EMI condition."
            );
        }

        sc.close();
    }
}
