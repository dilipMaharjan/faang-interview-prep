package com.dmed.bigo;
public class BigO{
    public static void main(String[] args){
        System.out.println(constantTime(10));

        linearTime(10);
        linearTime(10);
    }

    /**
     *
     * @param input
     * O(1) : Always one operation despite how large the input number is
     * Example : Grabbing a random card from a deck of cards.
     *
     */
   private static int constantTime(int input){
       return input*input;
   }

    /**
     *
     * @param input
     * O(n) : Number of operation increases as the size of the input increases
     * Example: Grabbing 10 of hearts, it can be the first card or the after few selection or the last one.
     *
     */
   private static void linearTime(int input){
       for(int i=0;i<input;i++){
           System.out.print(i+" ");
       }
   }

    /**
     * O(n)
     * @param input
     */
    private static void dropConstant(int input){
        for(int i=0;i<input;i++){
            System.out.print(i+" ");
        }
        //O(n)


        for(int j=0;j<input;j++){
            System.out.print(j+" ");
        }
        // O(n)

        /**
         * Calculation
         * O(n) + O(n) = O(2n)
         * Dropping constant
         * O(n)
         * Constant factors are not really a big deal for large input
         */
    }

    /**
     * O(n^2)
     * @param input
     * Nested loop
     */
    private static void quadraticTime(int input){
        for(int i=0;i<input;i++){
           for(int j=0;j<input;j++){
               System.out.print(i+ " " +j );
           }
        }
    }

    /**
     * O(n^2)
     * @param input
     */

    private static void dropNonDominantConstant(int input){
        for(int i=0;i<input;i++){
            for(int j=0;j<input;j++){
                System.out.println(i + " " + j);
            }
        }
        //O(n^2)
        for(int k=0;k<input;k++){
            System.out.println(k);
        }
        //O(n)
        /**
         * O(n^2) + O(n) = O(n^2 + n)
         *
         * Dropping Non Dominant term
         *O(n^2)
         */
    }

    /**
     * O(a+b)
     * @param a
     * @param b
     */
    private static void addTime(int a, int b){
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < b; i++) {
            System.out.println(i);
        }
    }

    /**
     * O(a*b)
     * @param a
     * @param b
     *
     */
    private static void multiplyTime(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i);
            }
        }
    }

    /**
     * O(n)
     * Recursive calls saves intermediate state in the stack memory.
     * @param input
     * @return
     */
    private static int spaceComplexity(int input){
        if(input<=0){
            return 0;
        }
        return input + spaceComplexity(input-1); //recursive call
    }

    /*
     * Rule 1 O(1)  : Any assignment statements and if statements that are executed once regardless of the size of the problem
     * Rule 2 O(n)  : A simple "for" loop from 0 to n ( with no internal loop)
     * Rule 3 O(n2) : A nested loop of the same type takes quadratic time complexity
     * Rule 4 O(log n) : A loop, in which the controlling parameter is divided by two at each step
     * Rule 5 : When dealing with multiple statements, just add them up
     *
     */
}
