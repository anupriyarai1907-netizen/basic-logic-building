import java.util.Scanner;

public class CricketTournamentScoreAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int wins = 0;
        int losses = 0;
        int ties = 0;
        int points = 0;
        int totalRuns = 0;
        int highestScore = 0;

        for (int i = 0; i < n; i++) {

            int teamRuns = sc.nextInt();
            int opponentRuns = sc.nextInt();

            totalRuns += teamRuns;

            if (teamRuns > highestScore) {
                highestScore = teamRuns;
            }

            if (teamRuns > opponentRuns) {

                wins++;
                points += 2;

            } else if (teamRuns < opponentRuns) {

                losses++;

            } else {

                ties++;
                points += 1;
            }
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
        System.out.println("Points: " + points);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Highest Score: " + highestScore);

        sc.close();
    }
}
