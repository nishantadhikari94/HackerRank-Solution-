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
    Scanner input=new Scanner(System.in);
    String str1=input.nextLine();
    String str2=input.nextLine();
    int str1Arr[]=new int[26];
    int str2Arr[]=new int[26];
    for(int i=0;i<str1.length();i++)
         str1Arr[str1.charAt(i)-97]++;
    for(int i=0;i<str2.length();i++)
         str2Arr[str2.charAt(i)-97]++;
    int count=0;
    for(int i=0;i<26;i++)
        count+=Math.abs(str1Arr[i]-str2Arr[i]);
    System.out.println(count);
    }
}
