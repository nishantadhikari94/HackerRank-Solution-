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
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        Set<Character> set = new HashSet<Character>();
        for(Character ch : inputString.toCharArray())
            {
            if(set.contains(ch))
              {
               set.remove(ch);
             }
            else
              {
               set.add(ch);
               }
           }
        
        System.out.println((set.size()<=1)?"YES":"NO");

        myScan.close();
    }
}
