package practice;

public class Reverse {
    public static long reverseNumber(long num){
        long rNum =0;
        long rem;
        while (num>0){
            rem = num%10;
            num = num/10;
            if (num>=0){
                rNum = rNum*10+rem;
            }
        }
        return rNum;
    }

    public static String reverseString(String str){
        
        return "";
    }
}
