package com.hacerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CompareTheTriplets {
    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static void main(String[] args) {

    }
    public static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        int bobResult=0;
        int aliceResult=0;
        List<Integer>results=new ArrayList<>();


        for (int i=0;i<alice.size();i++){
            if(alice.get(i)>bob.get(i)){
                aliceResult++;
            }else if(alice.get(i)==bob.get(i)){
                continue;
            }else {
                bobResult++;
            }
        }
        results.add(aliceResult);
        results.add(bobResult);
        return results;


    }
}
