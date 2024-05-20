package com.asish.interviewpreparations.string.length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LengthOfLastWord {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String:\n");
    String input = in.nextLine();
    int start = 0;
    int end = 0;
    List<String> subStrings = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ' ') {
        subStrings.add(input.substring(start, end));
        start = end + 1;
      }
      end++;
    }
    subStrings.add(input.substring(start, end));

    System.out.println(subStrings.get(subStrings.size() - 1).length());
  }
}
