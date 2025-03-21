# Arrays

## Two Sum Approaches

### 1. HashMap Approach
- Time Complexity: O(n)
- Uses a HashMap to store the difference between the target and the current element as the key, and the index of the current element as the value.

### 2. Brute Force Approach
- Time Complexity: O(n^2)
- Uses two nested loops to check all possible pairs of elements to see if they sum up to the target.

### 3. Sorting and Two Pointers Approach
- Time Complexity: O(n log n)
- Sorts the array and uses two pointers to find the two indices that sum up to the target.

## Best Time to Buy and Sell Stock

### Optimal Approach
- Time Complexity: O(n)
- Keeps track of the minimum price and calculates the maximum profit by iterating through the prices array.