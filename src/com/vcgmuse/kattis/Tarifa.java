package com.vcgmuse.kattis;


import java.io.IOException;

public class Tarifa {

  public static void main(String[] args) throws IOException {

    PrintWriterClass io = new PrintWriterClass(System.in, System.out);
    int x = io.getInt();
    int y = io.getInt();
    int total = x * y;
    int p = 0;
    while (io.hasMoreTokens()) {
      int temp = io.getInt();
      p += temp;
    }
    int ans = (total - p) + x;

    io.println(ans);
    io.close();
  }
}

