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
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int leftDiagonal   = 0;
        int rightDiagonal = 0;
        
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                int value = scan.nextInt();
                if (row == col) {
                    leftDiagonal += value;
                } 
                if (row + col == N - 1) {
                    rightDiagonal += value;
                }
            }
        }
        scan.close();
        
        int absoluteDifference = Math.abs(leftDiagonal - rightDiagonal);
        System.out.println(absoluteDifference);
    }
 }
        
