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
        String B = in.next();
       //this is one line solution , remove remaining code except this line. Code will the desired output
        // System.out.println((B.length() - B.replaceAll("010", "").length())/3);
       
       int step = 0;
       for (int i = 0; i <= n - 3;) 
           {
            if (B.substring(i, i + 3).equals("010"))   //check the occurnance of 010
              {
               step++;                                 //if they 010, increment step
               i = i + 3;                              //jump two position, because including 'i' 3 characters are checked
              } 
           else 
              {
               i++;                                    //if 010 do not occur, 'i' will remian 0
              }
           }
    System.out.println(step);
    }    
}
