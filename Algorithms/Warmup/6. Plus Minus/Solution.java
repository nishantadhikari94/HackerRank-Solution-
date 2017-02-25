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
        int N = in.nextInt();
        int arr[] = new int[N];
        
        double fracPositive = 0; 
        double fracNegative = 0;
        double fracZero = 0;
        
        for(int arr_i=0; arr_i < N; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0) {fracPositive++;}
            else if (arr[arr_i]==0) {fracZero++;}
            else if (arr[arr_i]<0) {fracNegative++;}
        }
        
        System.out.println(fracPositive/N);
        System.out.println(fracNegative/N);
        System.out.println(fracZero/N);
    }
}
