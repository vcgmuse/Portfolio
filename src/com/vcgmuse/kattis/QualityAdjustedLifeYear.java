package com.vcgmuse.kattis;

import java.io.IOException;

public class QualityAdjustedLifeYear {

  public static void main(String[] args) throws IOException {
    PrintWriterClass io = new PrintWriterClass(System.in, System.out);

    int n = io.getInt();
    int i = 0;
    double sum = 0;
    while (i < n) {
      double x = io.getDouble();
      double y = io.getDouble();
      sum += x * y;
      i++;
    }
    System.out.println(sum);
  }
}
