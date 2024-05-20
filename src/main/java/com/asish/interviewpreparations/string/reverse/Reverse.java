package com.asish.interviewpreparations.string.reverse;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String text = "Hello world, welcome to the world of Java";
        char[] input = text.toCharArray();
        for (int i = 0, j = input.length - 1; i < input.length / 2; i++, j--) {
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        System.out.println(Arrays.toString(input).replace(",", ""));
    }
}
