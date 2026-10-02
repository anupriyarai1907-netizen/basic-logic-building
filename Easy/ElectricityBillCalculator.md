# Electricity Bill Calculator

**Difficulty:** Easy  
**Time Limit:** 15 minutes

## Problem Statement

A local electricity board calculates the monthly electricity bill based on the number of units consumed.

The billing system follows these rules:

- First 100 units → ₹5 per unit
- Next 100 units (101–200) → ₹7 per unit
- Next 200 units (201–400) → ₹10 per unit
- Above 400 units → ₹15 per unit

For example, if a customer consumes 250 units, the first 100 units are charged at ₹5, the next 100 at ₹7, and the remaining 50 at ₹10.

Write a program to calculate the total electricity bill.

## Input Format

A single integer `N`, representing the number of units consumed.

## Output Format

Print the total electricity bill.

## Constraints

- 0 ≤ N ≤ 10,000

## Example

### Input
250

### Output
1700

## Explanation

- First 100 units = 100 × 5 = ₹500
- Next 100 units = 100 × 7 = ₹700
- Remaining 50 units = 50 × 10 = ₹500
- Total = ₹1700

## Test Cases

**Input:** 80  
**Output:** 400

**Input:** 150  
**Output:** 850

**Input:** 500  
**Output:** 4700
