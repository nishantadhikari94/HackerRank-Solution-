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
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            Set<Character> set = new HashSet<>();
             char[] c = s.toCharArray();
            for(char ch: c)
              {
               set.add(ch);
              }
           System.out.println(set.size());
       }
     }
}

