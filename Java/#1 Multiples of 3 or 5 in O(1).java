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
            n--;
            long sum = 0;
            long three = n/3;
            long five = n/5;
            long fifteen = n/15;
            sum += (3*(three*(three+1))>>1) + (5 * (five*(five+1))>>1) - (15*(fifteen*(fifteen +1))>>1);
            
            System.out.println(sum);
        }
    }
}

