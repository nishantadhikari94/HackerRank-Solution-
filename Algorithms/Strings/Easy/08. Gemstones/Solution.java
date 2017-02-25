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
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[] array = new String[n];
        int maxLength=0;
        int maxIndex =-1;
        for(int i=0;i<n;i++)    
        {
            array[i] = scanner.next();
            if(array[i].length()>maxLength)     
            {
                maxIndex =i;
                maxLength=array[i].length();
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<maxLength;i++)
        {
            String ch =String.valueOf(array[maxIndex].charAt(i));
            if(have(array,ch))
            {
                 if(!list.contains(ch))
                 {
                     list.add(ch);
                 }
            }
           
        }
        System.out.println(list.size());
    }
    
    public static boolean have(String[] array , String ch)
    {
        
        for(int i=0;i<array.length;i++)
        {
            if(!array[i].contains(ch))
                return false;
        }
        return true;
        
    }
    
}
