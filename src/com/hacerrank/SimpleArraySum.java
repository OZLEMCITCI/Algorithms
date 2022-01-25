package com.hacerrank;

public class SimpleArraySum {

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(simpleArraySum(arr));
    }
    /*
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(int[] ar) {
        //initial sum is zero
        int sum=0;

        for (int i:ar) {
            //on each loop sum =sum + element of the array
            sum+=i;
        }
        //when loop is ended. Final sum gives the addition of the all numbers of the array.
        return sum;

    }
}
