# ATM Transaction Simulator

**Difficulty:** Medium

**Estimated Time Limit:** 25 minutes

## Scenario

A bank wants to create a simple ATM simulation. The ATM starts with a particular account balance.

The customer can perform multiple transactions. For every transaction, the customer enters an operation:

- D → Deposit
- W → Withdraw
- B → Check Balance
- E → Exit

For withdrawal, the amount must not exceed the current balance. Invalid withdrawal requests must not change the balance.

The program should continue accepting transactions until the customer selects E.

## Input Format

First line: initial balance.

Then multiple lines containing:

`Operation Amount`

For B and E, no amount is provided.

## Output Format

For every transaction, print the corresponding result.

At the end print:

`Final Balance: <balance>`

## Constraints

- 0 ≤ initial balance ≤ 10^6
- 0 < transaction amount ≤ 10^6
- Maximum 100 transactions

## Example

### Input

5000
D 2000
W 1500
W 7000
B
E

### Output

Deposit Successful
Withdrawal Successful
Insufficient Balance
Balance: 5500
Final Balance: 5500

## Explanation

Initial balance = 5000

After deposit:

5000 + 2000 = 7000

After withdrawal:

7000 - 1500 = 5500

Withdrawal of 7000 is rejected because the balance is only 5500.
