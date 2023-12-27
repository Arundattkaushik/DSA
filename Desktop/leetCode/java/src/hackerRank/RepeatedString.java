package hackerRank;

import java.util.Scanner;

public class RepeatedString {
    /*

  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println("Enter a number for string occurence");
        long l = sc.nextLong();
        long letCount = repeatString(s, l);
        System.out.println(letCount);
        sc.close();
    }

    public static long repeatString(String s, long n){
        long q = n/s.length();
        long r = n%s.length();
        long partialStrLength = (r==0) ? 0 : r;
        long aCount = q*getString(s,s.length()) + getString(s,partialStrLength);
        return aCount;
    }

    public static int getString(String sbString, long sLength){
        int count=0;
        for (int i=0; i<sLength;i++){
            if(sbString.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
}
