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
        int n = in.nextInt();
        String[] str = new String[n];
        
        for(int i=0;i<n;i++){
            str[i]=in.next();
        }   
        
        for(int i=0;i<n;i++)
            {
             boolean isNot=true;
             int len =str[i].length();
              String s = str[i];
              for(int j=0;j<=len/2;j++)   //checking till the mid of string because we have to check for the palindrome 
                 {
                  if(s.charAt(j)!=s.charAt(len-j-1))  //checking for the palindrome condition if character match
                    {                
                       if(s.charAt(j+1)==s.charAt(s.length()-j-1) && s.charAt(j+2)==s.charAt(s.length()-j-2)) 
                           //if condition is satisfied the no of match will be shwon as the output
				           System.out.println(j);
			           else
				           System.out.println(s.length()-j-1);
                
                      isNot=false;
                      break ;
                    }
                 }
             if(isNot)
                 System.out.println("-1");
        }
        
    }
}
