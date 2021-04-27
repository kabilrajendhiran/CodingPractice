package com.company.demo;

import java.util.Arrays;
import java.util.Locale;

public class FillAndFindWordInMatrix {

    public char[][] fillMatrix;



    public void fillMatrix(String sentence)
    {
        sentence = sentence.toLowerCase();
        int m =5;
        int n = sentence.length()/m;
        int rem = sentence.length() - (m*n);
        n =n+ (rem/n)+1;

        fillMatrix = new char[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(fillMatrix[i],' ');
        }

        int count = 0;
        for (int i = 0; i < n && count<sentence.length(); i++) {
            for (int j = 0; j < m && count<sentence.length(); j++) {
                fillMatrix[i][j] = sentence.charAt(count++);
            }
        }

        System.out.println(Arrays.deepToString(fillMatrix));
        searchWord("woo");
    }

    public void searchWord(String word)
    {
        int wordLength = word.length();
        for (int i = 0; i < fillMatrix.length; i++) {
            for (int j = 0; j < fillMatrix[i].length; j++) {



                int c = 0;
                if(fillMatrix[i][j] == word.charAt(0))
                {
                    int x = i;
                    int y = j;
                    String output = "";

                    // left direction
                    while (y>=0 && y< fillMatrix[x].length && c<wordLength && word.charAt(c)==fillMatrix[x][y])
                    {
                        /*System.out.println(fillMatrix[x][y]);*/
                        output=output + "("+x+","+y+") ";
                        c++;
                        y--;


                    }


                    if(c==wordLength)
                    {
                        System.out.println(output);
                    }


                    x= i;
                    y= j;
                    c = 0;
                    output = "";

                    // Right Direction
                    while (y< fillMatrix[x].length && c<wordLength && word.charAt(c)==fillMatrix[x][y])
                    {
                        /* System.out.println(fillMatrix[x][y]);*/
                        output=output + "("+x+","+y+") ";
                        c++;
                        y++;
                    }


                    if(c==wordLength)
                    {
                        System.out.println(output);
                    }

                    x=i;
                    y=j;
                    c = 0;
                    output = "";

                    //Top direction
                    while (x>=0 &&x< fillMatrix.length &&  c<wordLength && word.charAt(c)==fillMatrix[x][y])
                    {
                        /*System.out.println(fillMatrix[x][y]);*/
                        output=output + "("+x+","+y+") ";
                        c++;
                        x--;

                    }

                    if(c==wordLength)
                    {
                        System.out.println(output);
                    }

                    x= i;
                    y= j;
                    c= 0;
                    output = "";
                    // Bottom direction
                    while (x< fillMatrix.length && c<wordLength && word.charAt(c)==fillMatrix[x][y])
                    {
                        /*System.out.println(fillMatrix[x][y]);*/
                        output=output + "("+x+","+y+") ";
                        c++;
                        x++;
                    }

                    if(c==wordLength)
                    {
                        System.out.println(output);
                    }

                }

            }
        }
    }


}
