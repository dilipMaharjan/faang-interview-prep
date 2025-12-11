package com.dmed.arrays.linnear.OneD;

public class Crud {
    int[] arr = null;

    public Crud(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Insert value in the array
    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted " + value + " at location " + location);
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
    //Traverse the array
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array not initialized");
        }
    }
    //Access a specific index
    public void access(int index) {
        try {
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
    //Search for a value in the array
    public void search(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println("Value " + value + " found at index " + i);
                    return;
                }
            }
        }catch (Exception e) {
            System.out.println("Array not initialized");
            return;
        }
    }
    //Delete a value at a specific index
    public void delete(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Value deleted at index " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");

        }
    }
}
