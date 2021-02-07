package com.vcgmuse.kattis;

import java.lang.Math;

public class Pot {
  public static void main(String[] args) {
    PrintWriterClass io = new PrintWriterClass(System.in);
    int n = io.getInt();
    int sum = 0;
    while (io.hasMoreTokens()) {
      String num = String.valueOf(io.getInt());
      int power = Integer.parseInt(num.substring(num.length() - 1));
      int number = Integer.parseInt(num.substring(0, num.length() - 1));

      sum += Math.pow(number, power);
    }
    System.out.println(sum);

  }
}
