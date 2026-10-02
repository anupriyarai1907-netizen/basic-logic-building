# Parking Fee Calculator

**Difficulty:** Medium

**Estimated Time Limit:** 25 minutes

## Problem Statement

A shopping mall wants to automate its parking system.

The parking fee depends on the vehicle type:

- C — Car
- B — Bike
- T — Truck

The charges are:

### Car
- First 2 hours → ₹30/hour
- Additional hours → ₹20/hour

### Bike
- First 2 hours → ₹15/hour
- Additional hours → ₹10/hour

### Truck
- First 2 hours → ₹50/hour
- Additional hours → ₹40/hour

Given multiple vehicles, calculate the total parking collection.

## Input Format

First line contains integer N, the number of vehicles.

Next N lines contain:

`VehicleType Hours`

## Output Format

Print:

`Total Collection: <amount>`

## Constraints

- 1 ≤ N ≤ 1000
- 1 ≤ Hours ≤ 100

## Example

### Input

3
C 3
B 2
T 4

### Output

Total Collection: 290

## Explanation

Car:

2 × 30 + 1 × 20 = 80

Bike:

2 × 15 = 30

Truck:

2 × 50 + 2 × 40 = 180

Total:

80 + 30 + 180 = 290

## Test Cases

### Test Case 1

Input:

2
C 2
B 5

Output:

Total Collection: 90

### Test Case 2

Input:

4
T 1
C 4
B 3
C 2

Output:

Total Collection: 210
