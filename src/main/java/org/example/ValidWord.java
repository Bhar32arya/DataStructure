package org.example;
public class ValidWord {
    /*How many are valid words in string
    * 1. Only alphanumreic allowed
    * 2. Atleast one vowel and consonant
    * 3. Atleast word length should be three
    * */
    public static void main(String[] args) {

        String str = "How ma5rn ar$ valid word ww";
        int count = 0;
        for(String input : str.split("\\s")) {
            if(isValid(input.toLowerCase())) {
                System.out.println(input);
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean isValid(String input) {
        if(input.length() <= 2) {
            return false;
        }
        if(!input.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        boolean hasVowel = false;
        boolean hashCons = false;
        for (char ch : input.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
                hasVowel = true;
            } else {
                hashCons = true;
            }
        }
        return hashCons && hasVowel;
    }
}
