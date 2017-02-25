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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=0;i<n;i++)
           { 
            String str = input.next();
            int count = 0;
            for(int j=0; j<str.length()-1; j++)
                {
                 if(str.charAt(j)==str.charAt(j+1))   //count number of alernating characters 
                      count++;
                }
            System.out.println(count);
           }
     }
}
