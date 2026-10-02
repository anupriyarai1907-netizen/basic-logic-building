# Smart Grocery Checkout

**Difficulty:** Medium

**Estimated Time Limit:** 30 minutes

## Problem Statement

A supermarket wants to implement a smart billing system.

A customer purchases N products. For each product, the program receives its price and quantity. The system calculates the subtotal.

The supermarket provides discounts based on the subtotal:

- Below ₹1,000 → No discount
- ₹1,000–₹4,999 → 5% discount
- ₹5,000–₹9,999 → 10% discount
- ₹10,000 or more → 15% discount

After applying the discount, an additional 5% tax is charged on the discounted amount.

## Input Format

First line contains N.

Next N lines contain:

`Price Quantity`

## Output Format

Print:

- Subtotal: <amount>
- Discount: <amount>
- Tax: <amount>
- Final Amount: <amount>

Print monetary values up to 2 decimal places.

## Constraints

- 1 ≤ N ≤ 100
- 1 ≤ Price ≤ 100000
- 1 ≤ Quantity ≤ 100

## Example

### Input

3
500 2
1000 1
200 5

### Output

Subtotal: 3000.00
Discount: 150.00
Tax: 142.50
Final Amount: 2992.50

## Explanation

Subtotal:

500 × 2 + 1000 × 1 + 200 × 5 = 3000

₹3000 falls into the 5% discount category.

Discount:

3000 × 5% = 150

Discounted amount:

3000 - 150 = 2850

Tax:

2850 × 5% = 142.50

Final amount:

2992.50

## Test Cases

### Test Case 1

Input:

2
500 1
400 1

Output:

Subtotal: 900.00
Discount: 0.00
Tax: 45.00
Final Amount: 945.00

### Test Case 2

Input:

2
5000 1
6000 1

Output:

Subtotal: 11000.00
Discount: 1650.00
Tax: 467.50
Final Amount: 9817.50
