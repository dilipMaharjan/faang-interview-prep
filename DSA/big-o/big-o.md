
# What is good code

- Readable
- Scalable
  - performance

## Big O

    - https://www.bigocheatsheet.com/
    - Measure of time taken to complete a task as the size increases
    - O(1)
        - Constant 
        - No loops 
    - O(log N) 
        - Logarithmic
        - Usually search algorithms if sorted(binary search not hashmaps)
    - O(n)
        - Linear
        - for loops
        - while loops
    - O(nlogn)
        - Log Linear 
        - Usually sorted operations
    - O(n^2)
        - Quadratic 
        - Every Element in a collection needs to be compared to every other element
        - Two nested loops
    - O(2^N)
        - Exponential
        - Recursive algorithms that solves a problem of size N
    - O(n!)
        - You are adding a loop for every element
    - Iterations through half a collection is still O(n)
    - Two separate collections : O(a+b)

## what can cause time in a function

    - Operations ( +,-,*,/)
    - Comparisions (<,>,==)
    - Looping ( for, while)
    - Outside function call (function())  

## Rules

    - Rule 1: Always Worst Case 
    - Rule 2: Remove Constants
    - Rule 3: Different input should have different variables. O(a+b). A and B arrays nested would be O(a*b). + for steps in order and * for nested steps
    - Rule 4: Drop non-dominant terms

## what causes space complexity

    - Vairables
    - Data Structures
    - Functional Call
    - Allocations
