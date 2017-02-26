// Author : Nishant Adhikari

// HackerRank : https://www.hackerrank.com/neucledo

// Github : https://github.com/nishantadhikari94

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*The key insight is to realize that you want the following invariant to hold: the count of A, T, G, and C outside the substring are all <= N / 4. Find the largest substring starting from 0 for which this holds. This is your right bound. Then try and make the substring smaller and smaller by increasing the left bound of the substring. If this makes the invariant false, you need to increase the right bound. For each left and right bound where the invariant holds, update your "best solution so far" if the distance between left and right is smaller. Once the right bound hits the end of the string, you have exhausted all possible solutions, return the best so far.*/

public class Solution {

   
        private static int n;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        String str = input.next();
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
        for (Character c : str.toCharArray())
            map.put(c, map.get(c) + 1);

        int left = 0, right = 0, min = Integer.MAX_VALUE;
        while(right < n - 1){
            char rc = str.charAt(right++);
            map.put(rc, map.get(rc) - 1);
            while(isSteady(map)){
                min = Math.min(min, right - left);
                char lc = str.charAt(left++);
                map.put(lc, map.get(lc) + 1);
            }
        }
        System.out.println(min);
    }

    private static boolean isSteady(Map<Character, Integer> map) {
        for (Integer i : map.values())
            if (i > n / 4) return false;
        return true;
    }
    }
