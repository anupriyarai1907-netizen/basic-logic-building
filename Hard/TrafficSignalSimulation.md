# Traffic Signal Simulation

**Difficulty:** Hard

**Estimated Time Limit:** 40 minutes

## Scenario

A city traffic department wants to simulate vehicles passing through a traffic signal.

The signal operates in three states:

- R → Red
- Y → Yellow
- G → Green

During a red signal, vehicles must stop. During yellow, vehicles slow down, and during green, vehicles can pass.

For each signal cycle, the system receives the signal and number of vehicles waiting.

The number of vehicles that can pass depends on the signal:

- Red → 0 vehicles
- Yellow → 2 vehicles
- Green → 10 vehicles

If more vehicles are waiting than the allowed number, the remaining vehicles stay in the queue for the next cycle.

## Input Format

First line contains N, number of signal cycles.

Next N lines contain:

`Signal VehiclesWaiting`

## Output Format

For every cycle print:

`Cycle i: Passed = X, Remaining = Y`

At the end print:

`Total Passed: X`

`Final Queue: Y`

## Constraints

- 1 ≤ N ≤ 1000
- 0 ≤ VehiclesWaiting ≤ 100000
- Signal is one of R, Y, G

## Example

### Input

4
G 8
R 5
Y 7
G 12

### Output

Cycle 1: Passed = 8, Remaining = 0
Cycle 2: Passed = 0, Remaining = 5
Cycle 3: Passed = 2, Remaining = 5
Cycle 4: Passed = 10, Remaining = 7

Total Passed: 20
Final Queue: 7

## Explanation

Cycle 1:

Green allows 10 vehicles, but only 8 are waiting.

Passed = 8, Remaining = 0.

Cycle 2:

Red allows no vehicles.

Passed = 0, Remaining = 5.

Cycle 3:

7 vehicles are waiting. Yellow allows 2.

Passed = 2, Remaining = 5.

Cycle 4:

5 previous vehicles + 12 new vehicles = 17.

Green allows 10.

Passed = 10, Remaining = 7.
