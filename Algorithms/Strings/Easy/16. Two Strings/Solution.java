// Author : Nishant Adhikari
// HackerRank : https://www.hackerrank.com/neucledo
// Github : https://github.com/nishantadhikari94

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n =input.nextInt();

        for(int i=0;i<n;i++)
        {
           String str1 = input.next();
           String str2 = input.next();
           boolean flag = false;
           int[] arr = new int[26]; 
           for(int j=0;j<str1.length();j++)
           {
              arr[str1.charAt(j) - 97]++;
           }
           for(int j=0;j<str2.length();j++)
           {
              if(arr[str2.charAt(j) - 97] > 0)
              {
                  flag =true;
                  break;
              }    
           } 
            if(flag)
             System.out.println("YES");
            else
             System.out.println("NO");   
        }    
    }
}
