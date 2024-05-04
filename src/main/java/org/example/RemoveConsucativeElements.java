package org.example;

public class RemoveConsucativeElements {
    public static void main(String[] args) {
        String str = "caabbbcdrreddg";
        char temp = str.charAt(0);
        String result = "";
        for(int i = 1; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != temp) {
                result = result + ch;
                temp = ch;
            }
        }
        System.out.println(str.charAt(0) + result);
    }
}
