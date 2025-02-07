class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, tank = 0, startPosition = 0;

        // Step 1: Calculate total gas and cost
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // Step 2: If total gas is less than total cost, return -1 (not possible)
        if (totalGas < totalCost) {
            return -1;
        }

        // Step 3: Find the valid starting station
        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            // If tank goes negative, reset start index to next station
            if (tank < 0) {
                startPosition = i + 1;
                tank = 0;
            }
        }
        return startPosition;
    }
}