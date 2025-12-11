package com.dmed.arrays.linnear.OneD;

import java.util.Arrays;

public class OneDApp {
    public static void main(String[] args) {
        array();
    }

    private static void array() {
        //Declare array
        int[] arr;

        //Instantiate array
        arr = new int[5];

        //printing uninitialized array defaults to data type defaults
        System.out.println(Arrays.toString(arr));

        //Initialize array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        //Declare, instantiate and initialize at once

        String[] strArray = {"Declare", "Instantiate", "Initialize"};
        System.out.println(Arrays.toString(strArray));


        //Using ArrayCRUD1D
        Crud crud = new Crud(5);
        crud.insert(0, 10);
        crud.insert(1, 20);
        crud.traverse();
        crud.access(1);
        crud.search(10);
        crud.delete(0);
        crud.traverse();

    }
}
