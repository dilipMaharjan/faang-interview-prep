package com.dmed.arrays.linnear.TwoD;

public class Crud {
    int[][] arr = null;

    public Crud(int row, int col) {
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //Insert value in the array
    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + " at location " + row + " " + col);
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }


    //Access a specific index
    public void access(int row, int col) {
        try {
            System.out.println("Value at row " + row + " and col " + col + " is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    public void traverse() {
        try {
            System.out.println("Printing all the elements in the array:");
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Array not initialized");
        }
    }

    //Search for a value in the array
    public void search(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value " + value + " found at location " + row + " " + col);
                    return;
                }
            }
        }
        System.out.println("Value " + value + " not found in the array");
    }

    //Delete a value at a given index
    public void delete(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted value at location " + row + " " + col);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
}
