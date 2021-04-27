package com.company.demo;

public class StringPatternPrinting {
    public void printPattern(String s)
    {
        int length  = s.length();
        int mid = length/2;
        String output = "";

        int i =mid;
        while (i<s.length())
        {
            i++;
            output ="";
            spaceGenerator(s.length()-i+mid);
            for (int j = 0; j < i; j++) {

                if(j>=mid)
                {
                    output = output+s.charAt(j);
                }

            }
            System.out.println(output);

        }

        for (int j = 0; j < mid; j++) {
            spaceGenerator(mid-j-1);
            String suffix ="";
            for (int k = 0; k <= j; k++) {
                suffix = suffix+ s.charAt(k);
            }
            System.out.println(output+suffix);
        }

    }

    public void spaceGenerator(int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
}
