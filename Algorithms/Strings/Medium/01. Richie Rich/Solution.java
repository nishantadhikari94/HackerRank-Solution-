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
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      String number = in.next();
      char []c=number.toCharArray();
      int a[]=new int[(n+1)/2];

      for(int i=0;i<(n+1)/2;i++)
         {
          a[i]=0;
          }


     for(int i=0;i<n/2;i++)
            {
            int x=(int)c[i];
            int y=(int)c[n-1-i];

            if(x>y)
                {
                y=x;
                k--;
                a[i]++;
            }
            else if(y>x)
                {
                x=y;
                k--;
                a[i]++;
            }

            c[i]=(char)x;
            c[n-1-i]=(char)y;
        }

     if(n%2 != 0)
        {
        a[n/2]=2;
       }

        int j=0;
        while((k>0)&&(j< n/2))
            {
            int l= Character.getNumericValue(c[j]);

           if((a[j]==0)&&(l<9)&&(k>1))
               {
               c[j]='9';
               c[n-1-j]='9';
               k=k-2;
           }

            else if((a[j]==1)&&(l<9))
                    {
                    c[j]='9';
                    c[n-1-j]='9';
                    k--;

                }
            else if((a[j]==2)&&(l<9))
                {
                c[j]='9';
                k--;
            }
           
            j++;
        }
    int l1= Character.getNumericValue(c[j]);
    if((k>0) && (n%2 != 0) && (l1 <9))
        {
        c[j]='9';
        k--;
    }

        if(k<0)
            {
            System.out.println("-1");
        }
        else
            {
            String s=new String(c);
            System.out.println(s);
        }
}
}
