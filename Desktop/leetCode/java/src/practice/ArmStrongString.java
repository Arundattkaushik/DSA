package practice;

import java.util.Scanner;

public class ArmStrongString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        String rs = Reverse.reverseString(s);
        if (rs.equals(s)){
            System.out.println(s+" is an armstrong string");
        }
        else {
            System.out.println(s+" is not an armstrong string");
        }
    }
}
