package com.asish.interviewpreparations.string.prefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prefix {
  public static void main(String[] args) {
    String[] text = {"aallo world, welcome to the world of Java", "test", "test 2"};
    List<String> inputs = Arrays.stream(text).toList();

    String minLengthString = minLengthString(inputs);
    char[] output = new char[minLengthString.length()];
    boolean flag = true;
    for (int i = 0; i < minLengthString.length() && flag; i++) {
      char dummyChar = minLengthString.charAt(i);

      for (String input : inputs) {
        if (dummyChar != input.charAt(i)) {
          flag = false;
          break;
        }
      }
      if (flag) {
        output[i] = dummyChar;
      }
    }

    System.out.println(Arrays.toString(output));

    System.out.println(longestCommonPrefix(text));
  }

  private static String minLengthString(List<String> inputs) {
    return inputs.stream().sorted(Comparator.comparingInt(String::length)).toList().get(0);
  }

  // second approach
  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) return "";
      }
    return prefix;
  }
}
