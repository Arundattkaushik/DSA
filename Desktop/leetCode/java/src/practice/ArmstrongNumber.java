package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        long l = sc.nextLong();
        Boolean b = isArmstrong(l);
        if (b==true){
            System.out.println(l+" is an Armstrong number");
        }
        else {
            System.out.println(l+" is not an Armstrong Number");
        }

    }

    private static Boolean isArmstrong(long num) {
        long rNum = Reverse.reverseNumber(num);
        System.out.println(rNum);
        return rNum==num;
    }
}
