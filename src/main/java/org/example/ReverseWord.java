package org.example;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "a good   example";
        String arr[] = str.split(" ");
        for(String word : arr) {
            if(!word.equals("")) {
                System.out.println(word + " @");
            }
        }
    }
}
