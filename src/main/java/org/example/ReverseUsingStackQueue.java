package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseUsingStackQueue {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "hello i am bhartendu";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            newStr = newStr + stack.pop();
        }
        System.out.println(newStr);

        Queue<Character> queue = new LinkedList<>();


    }
}
