package org.example;

public class VowelsSwap {

    public static void main(String[] args) {
        String s = "leetcode";
        char[] chars = s.toCharArray();
        int start = 0 ;
        int end = s.length() - 1;

        while (start < end){
            if (isVowel(chars[start]) && isVowel(chars[end])) {
                swap(chars, start, end);
                start++;
                end--;
            }
            if (!isVowel(chars[start])) {
                start++;
            }
            if (!isVowel(chars[end])) {
                end--;
            }
        }
         System.out.println(new String(chars));
    }

    private static void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
