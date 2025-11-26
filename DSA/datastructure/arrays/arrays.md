# Arrays 

---

## What is an Array?

In Java, an array is a fixed-size, indexed collection of elements that all share the same data type.

Arrays are created with a specific length that cannot be changed after creation.

Each element is stored at a numbered position called an index, starting from 0 up to length - 1.

You can access, modify, or replace elements using their index.

Arrays preserve the order of elements based on their index — the order you assign elements is the order they're stored.

Arrays can hold primitive types (like int, double, char) or reference types (like String, Object, custom classes).

All elements must be of the same type — no mixing of types.

Uninitialized elements have default values (0, false, or null, depending on type).

---

## Declaring and Initializing Arrays

- Declare with the syntax: `type[] name;`
- Initialize with a size: `name = new type[size];`
- Or declare and initialize with values: `type[] name = {val1, val2, ...};`

---

## Accessing and Modifying Elements

- Access elements by index: `array[index]`
- Modify elements by assigning a value: `array[index] = newValue;`
- Be careful not to access indexes out of bounds.

---

## Looping Through Arrays

- Use a standard `for` loop with index:  
  `for (int i = 0; i < array.length; i++)`
- Use enhanced `for-each` loop when index is not needed:  
  `for (type element : array)`

---

## Common Mistakes When Working with Arrays

```java
// 1. Off-by-one errors when looping
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i <= arr.length; i++) {  // ❌ Causes ArrayIndexOutOfBoundsException
    System.out.println(arr[i]);
}
// Fix:
for (int i = 0; i < arr.length; i++) {   // ✅ Correct
    System.out.println(arr[i]);
}

// 2. Accessing uninitialized elements
String[] names = new String[3];
System.out.println(names[0].length());  // ❌ NullPointerException because names[0] is null
// Fix:
names[0] = "Alice";
System.out.println(names[0].length());  // ✅ Works fine

// 3. Mixing incompatible data types
int[] numbers = new int[3];
numbers[1] = "20";  // ❌ Compile-time error: incompatible types
// Fix:
numbers[1] = 20;    // ✅ Correct
```
---
## Summary

| Concept        | Example Syntax                    |
|----------------|---------------------------------|
| Declare        | `int[] arr;`                    |
| Initialize     | `arr = new int[5];` or `int[] arr = {1,2,3};` |
| Access         | `arr[0]`, `arr[i]`               |
| Loop           | `for` or `for-each`              |
| 2D Array       | `int[][] matrix = new int[2][3];` |

---

## Time Complexity of Common Array Operations

Understanding the time complexity of array operations helps write efficient code. Here’s a summary of common array operations and their Big O complexities:

| Operation                      | Description                                  | Time Complexity |
|-------------------------------|----------------------------------------------|-----------------|
| **Access by index**            | Reading or writing an element at a given index | **O(1)** (constant time) |
| **Traversal (traditional for loop)** | Visiting every element one-by-one             | **O(n)** (linear time)   |
| **Traversal (enhanced for-each loop)** | Same as traditional traversal, cleaner syntax | **O(n)** (linear time)   |
| **Search (unsorted array)**   | Finding an element by checking each item    | **O(n)** (linear time)   |
| **Insertion (fixed size array)** | Adding or changing element at specific index | **O(1)** (constant time) |
| **Insertion (resize array)**  | Creating a new bigger array and copying all elements | **O(n)** (linear time)   |
| **Deletion (fixed size array)** | Removing an element (usually by shifting others) | **O(n)** (linear time)   |
| **Copying an array**           | Creating a duplicate array                   | **O(n)** (linear time)   |

---

### Explanation of Key Points

- **Access by index** is fast and constant time because arrays provide direct access to any position.

- **Traversal** (both `for` and `for-each`) loops visit every element exactly once, so their time complexity is linear in the number of elements.

- **Search** requires checking elements one by one unless the array is sorted and a faster algorithm (like binary search) is used.

- **Insertion and deletion** can be constant time if done at a known index without resizing, but if shifting elements or resizing is needed, time becomes linear.

- **Enhanced for-each loops** do not add overhead compared to traditional loops; they simply provide cleaner syntax for linear traversal.

---

### Summary

| Operation                  | Big O Complexity |
|----------------------------|------------------|
| Access by index            | O(1)             |
| Loop (for / for-each)     | O(n)             |
| Search                    | O(n)             |
| Insert at known index     | O(1)             |
| Insert with resizing      | O(n)             |
| Delete with shifting      | O(n)             |
| Copy array                | O(n)             |

---