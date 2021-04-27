package com.company.demo;

import java.util.ArrayList;

public class LongestIncreasingSubSequence {

    public int[] removeBarrierNumbers(int[] arr)
    {

        ArrayList<Integer> saveList = new ArrayList<>();

        int max = 0;
        int x = 0;
        int count=0;
        int j = 0;
        int[] a = new int[0];
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            count = 0;
            for ( j = i; j < arr.length; j++) {
                if(x<arr[j])
                {
                    count++;
                }

            }
            if(count==0 && i<arr.length-1)
            {
                a = new int[arr.length-1];

                int cnt =0;
                for (int k = 0; k < arr.length; k++) {
                    if(k!=i)
                    {
                        a[cnt++] = arr[k];
                    }
                }

                //System.out.println(Arrays.toString(a));
                //System.out.println("("+count+" : "+x+" : "+i+")");
               return removeBarrierNumbers(a);
            }

        }
        return arr;
    }

    public void findSolution(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {

        }
    }


}
