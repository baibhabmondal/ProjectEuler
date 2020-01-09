import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            long i = 2, prev = 0;
            while(i <= n) {
                sum += i;
                long next_even = 4*i + prev;
                prev = i;
                i = next_even;
                 
            }
            System.out.println(sum);
        }
    }
}

