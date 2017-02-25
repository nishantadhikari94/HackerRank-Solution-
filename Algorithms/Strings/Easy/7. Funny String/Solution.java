// Author : Nishant Adhikari
// HackerRank : https://www.hackerrank.com/neucledo
// Github : https://github.com/nishantadhikari94

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    int t=in.nextInt();

    while(t>0)
       {
        String s = in.next();
        int flag=0;

        for(int i=1, j=s.length()-2; i<s.length() && j>=0; i++, j--)   
            //checking the end points of string at once, two points at once
            {
            if(Math.abs(s.charAt(i)-s.charAt(i-1))==Math.abs(s.charAt(j)-s.charAt(j+1)))
              { }
            else
                {
                flag=1;
               }
       }
        
        if(flag==0)
            System.out.println("Funny");
        else
            System.out.println("Not Funny");

        t--;
      }
    }
}
