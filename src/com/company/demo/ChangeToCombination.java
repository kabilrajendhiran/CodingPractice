package com.company.demo;

public class ChangeToCombination {

    public int partitionInteger(int n,int de,int ds)
    {
        int num = 0;
        int count =0;
        while (n>0)
        {
            if(count>=ds && count<=de)
            {
                num =num + (int)((n%10)*Math.pow(10,count));
            }
            n = n/10;
            count++;
        }

        return num;
    }

    public int mergeNumber(int original,int n)
    {
        n = original - n;
        int count=0;
        int num = 0;
        while (n>0)
        {
            if(n%10!=0)
            {
                num =num + (int)((n%10)*Math.pow(10,count));
                count++;
            }
            n = n/10;

        }
        return num;
    }


    public int findNumberOfdigits(int num)
    {
        int count=0;
        while (num!=0)
        {
            num= num/10;
            count++;
        }

        return count;
    }

    public void findSolution(int num)
    {
        int numberOfDigits = findNumberOfdigits(num);
        boolean flag = true;

        for (int i = 0; i < numberOfDigits; i++) {
            for (int j = 0; j < numberOfDigits; j++) {
               int x= mergeNumber(num,partitionInteger(num,j,i));
               if(x!=0 && x%8==0)
               {
                   System.out.println("YES");
                   System.out.println(x);
                   flag = false;
                   break;
               }

            }
        }

        if(flag)
        {
            System.out.println("NO");
        }

    }




}
