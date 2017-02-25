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
        String time = in.next();
        try {
        DateFormat df = new SimpleDateFormat("hh:mm:ssa"); //hour:min:second, 'a'is for AM/PM mark
                                                           //h: hours 1-12,  m:minute,   s: seconds
        DateFormat out = new SimpleDateFormat("HH:mm:ss"); //convert to hour:min:second
                                                           //H: hours 0-23
        Date date = df.parse(time);
        System.out.println(out.format(date));
    } catch (ParseException e) {
        e.printStackTrace();
    }
    }
}
