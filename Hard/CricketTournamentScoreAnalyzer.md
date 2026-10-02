# Cricket Tournament Score Analyzer

**Difficulty:** Hard

**Estimated Time Limit:** 45 minutes

## Scenario

A college is conducting a cricket tournament.

Each team plays multiple matches, and the organizers want to generate a basic performance report.

For every match, the program receives the runs scored by the team and the runs scored by the opponent.

The result is determined as follows:

- Team score > opponent score → Win
- Team score < opponent score → Loss
- Equal scores → Tie

The tournament awards:

- Win → 2 points
- Tie → 1 point
- Loss → 0 points

The program must process all matches and calculate total wins, losses, ties, points, total runs scored, and highest score.

## Input Format

First line contains integer N, the number of matches.

Next N lines contain:

`TeamRuns OpponentRuns`

## Output Format

Print:

- Wins: <wins>
- Losses: <losses>
- Ties: <ties>
- Points: <points>
- Total Runs: <runs>
- Highest Score: <score>

## Constraints

- 1 ≤ N ≤ 1000
- 0 ≤ TeamRuns, OpponentRuns ≤ 1000

## Example

### Input

5
180 150
120 120
95 110
210 200
160 170

### Output

Wins: 2
Losses: 2
Ties: 1
Points: 5
Total Runs: 765
Highest Score: 210

## Explanation

Match 1:

180 > 150 → Win → 2 points

Match 2:

120 = 120 → Tie → 1 point

Match 3:

95 < 110 → Loss → 0 points

Match 4:

210 > 200 → Win → 2 points

Match 5:

160 < 170 → Loss → 0 points

Therefore:

- Wins = 2
- Losses = 2
- Ties = 1
- Points = 5
- Total Runs = 765
- Highest Score = 210

## Test Cases

### Test Case 1

Input:

3
100 90
120 130
150 150

Output:

Wins: 1
Losses: 1
Ties: 1
Points: 3
Total Runs: 370
Highest Score: 150

### Test Case 2

Input:

4
200 100
250 180
175 120
300 299

Output:

Wins: 4
Losses: 0
Ties: 0
Points: 8
Total Runs: 925
Highest Score: 300
