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
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        for(int i=0;i<n;i++)
           {
            String str=input.next();
            int l=str.length()/2;
            if(str.length()%2==0)
              {
               String str1=str.substring(0,l);
               String str2=str.substring(l);
               int count = 0;
               for(int j=0;j<str1.length();j++)
                  {
                   int index = str2.indexOf(str1.charAt(j));
                   if (index == -1)
                      {
                       count++;
                      }  
                   else 
                      {
                       str2 = str2.substring(0,index)+str2.substring(index+1);
                      }
                  }
            System.out.println(count); 
           }
        else
          System.out.println("-1"); 
    }
  }
}
