import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int terms = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));//converting string into a single character each time the loop execute
            if (letter == letter.toUpperCase()) {   //if letter == letter.toUppercase() then terms = terms+1
                terms++;                            //assuming that first letter will always be small, terms is initialized to 1
            }
        }
        System.out.println(terms);
    }
    }
