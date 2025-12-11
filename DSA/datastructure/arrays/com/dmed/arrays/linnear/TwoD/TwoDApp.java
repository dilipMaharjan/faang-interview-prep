package com.dmed.arrays.linnear.TwoD;

import java.util.Arrays;

public class TwoDApp {
    public static void main(String[] args) {
        array();
    }

    private static void array() {
        //Declare array
        int[][] arr;

        //Instantiate array
        arr = new int[2][2];

        //printing uninitialized array defaults to data type defaults
        System.out.println(Arrays.toString(arr));

        //Initialize array
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 3;

        System.out.println(Arrays.deepToString(arr));

        //Declare, instantiate and initialize at once

        String[][] strArray = {
                {"Declare", "Instantiate"},
                {"Initialize", "at once"}
        };
        System.out.println(Arrays.deepToString(strArray));

        //Using ArrayCRUD2D
        Crud arrayCRUD2D = new Crud(2, 2);
        arrayCRUD2D.insert(0, 0, 10);
        arrayCRUD2D.insert(0, 1, 20);
        arrayCRUD2D.insert(1, 0, 30);
        arrayCRUD2D.insert(0, 0, 11);

        System.out.println(Arrays.deepToString(arrayCRUD2D.arr));
        arrayCRUD2D.access(0, 0);

        arrayCRUD2D.traverse();
        arrayCRUD2D.search(20);
        arrayCRUD2D.delete(0,1);

    }
}
