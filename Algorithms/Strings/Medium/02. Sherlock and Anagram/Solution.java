// Author : Nishant Adhikari

// HackerRank : https://www.hackerrank.com/neucledo

// Github : https://github.com/nishantadhikari94

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* 1.Traverse all possible substrings within string
    2.Check if any two substrings of equal length are anagrams
*/

public class Solution {
        static int i;

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();

        while (input.hasNext()) 
        {
         System.out.println(noOfAnagrams(input.next()));
        }
       input=null;
      }

    public static int noOfAnagrams(String s) {
    int noa = 0;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    char c[] = s.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < c.length; i++) 
        {
         sb.append(c[i]);
         addTo(map, sb.toString());

          {
            for (int j = i + 1; j < c.length; j++) 
               {
                sb.append(c[j]);
                char tmpc[] = sb.toString().toCharArray();
                Arrays.sort(tmpc);
                addTo(map, new String(tmpc));
               }
            sb.setLength(0);
          }

        }

    //Get the combinations for each string in map
    for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
        if (entry.getValue() > 1) 
            {
            int r = 0;
            int n = entry.getValue() *(entry.getValue()-1) ;
            r = n / (2);
            noa = noa + r;
           }
       }
    return noa;
}


private static void addTo(HashMap<String, Integer> map, String s) 
   {
    if (map.get(s) == null) 
       {
        map.put(s, 1);
       } 
    else 
       {
        i++;
        map.put(s, map.get(s) + 1);
       }
   }

    
}
