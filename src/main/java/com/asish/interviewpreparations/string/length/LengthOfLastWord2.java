package com.asish.interviewpreparations.string.length;

import java.util.Scanner;

public class LengthOfLastWord2 {

  /*
      reverse the string and find the length of last word
  */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String:\n");
    String input = in.nextLine();
    char[] inputChar = new char[input.length()];
    inputChar = input.toCharArray();
    StringBuilder builder = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      if (inputChar[i] == ' ') {
        break;
      } else {
        builder.append(inputChar[i]);
      }
    }
    System.out.println(builder.toString().length());
  }
}
