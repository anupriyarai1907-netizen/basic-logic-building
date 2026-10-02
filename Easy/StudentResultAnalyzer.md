# Student Result Analyzer

**Difficulty:** Easy

**Estimated Time Limit:** 20 minutes

## Problem Statement

A college wants to automatically generate results for students.

Each student has marks in N subjects. A student passes a subject only if the marks are at least 40.

The student passes overall only when they pass every subject and their average marks are at least 50.

Write a program to calculate the total marks, average marks, number of failed subjects, and final result.

## Input Format

First line contains integer N, the number of subjects.

Second line contains N integers representing marks.

## Output Format

Print:

- Total: <total>
- Average: <average>
- Failed Subjects: <count>
- Result: PASS/FAIL

Print the average up to 2 decimal places.

## Constraints

- 1 ≤ N ≤ 20
- 0 ≤ marks ≤ 100

## Example

### Input

5
65 72 55 80 68

### Output

Total: 340
Average: 68.00
Failed Subjects: 0
Result: PASS

## Explanation

Total:

65 + 72 + 55 + 80 + 68 = 340

Average:

340 / 5 = 68

No subject has marks below 40, and the average is above 50.

## Test Cases

### Test Case 1

Input:

4
80 75 90 85

Output:

Total: 330
Average: 82.50
Failed Subjects: 0
Result: PASS

### Test Case 2

Input:

5
80 35 70 65 75

Output:

Total: 325
Average: 65.00
Failed Subjects: 1
Result: FAIL
