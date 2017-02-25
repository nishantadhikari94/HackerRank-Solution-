import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner stdin = new Scanner(System.in);
        StringBuffer s = new StringBuffer(stdin.nextLine());
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {  // charAt(1)==charAt(0)
                s.delete(i-1, i+1);             // s.delete(0,1)
                i = 0; //helps in going back to loop
            }
        }
        if(s.length() == 0) System.out.println("Empty String");
        else System.out.println(s);
    }

    }
