package com.company.demo;

public class MagicalString {
    public void findMagicalString(String s1 , String s2)
    {
        String output="";
        for (int i = 0; i < s1.length(); i++) {
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            int c =  (c2-c1);
            c1 = c1+c/2;

            if(c>1)
            {
                output = output+(char)c1;
            }

        }

        if(output.isEmpty())
        {
            System.out.println("No such string");
        }
        else
        {
            System.out.println(output);
        }
    }


}
