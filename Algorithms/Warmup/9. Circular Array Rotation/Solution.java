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
        int k = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        //rotate array in 3 reverse position 
        k = k%n; //in case where k>n
        reverse(arr,0,arr.length-1);     
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        
        //for output
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(arr[m]);
        }
       in.close();
    }
       
        private static void reverse(int [] arr, int start, int end) 
        {
         if (arr == null || start < 0 || start >= arr.length || end < 0 || end >= arr.length || start >= end) 
            {
              return;
            }
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) 
              {
               int offset = i - start;
               swap(arr, start + offset, end - offset);
               }
        }
        
       private static void swap (int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       }
    }

