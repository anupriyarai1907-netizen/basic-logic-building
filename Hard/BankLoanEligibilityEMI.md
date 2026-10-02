# Bank Loan Eligibility & EMI Schedule

**Difficulty:** Hard

**Estimated Time Limit:** 35 minutes

## Problem Statement

A bank wants to automate its preliminary loan eligibility system.

A customer provides their monthly salary, existing monthly EMI, credit score, and requested loan amount.

The customer is eligible only if:

- Salary is at least ₹25,000.
- Credit score is at least 700.
- Existing EMI is not more than 40% of monthly salary.

If eligible, the bank determines the maximum permissible EMI as 50% of the salary minus the existing EMI.

The program must then calculate a simple monthly repayment schedule using the given annual interest rate and number of months.

## Input Format

Input contains:

`Salary ExistingEMI CreditScore LoanAmount AnnualInterest Months`

## Output Format

If not eligible:

`Loan Status: NOT ELIGIBLE`

Otherwise print:

`Loan Status: ELIGIBLE`

`Maximum EMI: <amount>`

`Estimated Monthly EMI: <amount>`

## Constraints

- 25000 ≤ Salary ≤ 1000000
- 0 ≤ ExistingEMI ≤ Salary
- 300 ≤ CreditScore ≤ 900
- 10000 ≤ LoanAmount ≤ 10000000
- 1 ≤ AnnualInterest ≤ 30
- 1 ≤ Months ≤ 120

## Example

### Input

60000 10000 750 500000 12 24

### Output

Loan Status: ELIGIBLE
Maximum EMI: 20000.00
Estimated Monthly EMI: 23536.74

## Explanation

Salary = ₹60,000

Existing EMI ratio:

10000 / 60000 × 100 = 16.67%

Credit score = 750, which satisfies the requirement.

Maximum permissible EMI:

50% of 60000 - 10000 = 20000

The program then calculates the EMI for ₹5,00,000 over 24 months at 12% annual interest.

If the estimated EMI exceeds the maximum permissible EMI, the program should report that the requested loan amount cannot be approved under the EMI condition.
