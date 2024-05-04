package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
