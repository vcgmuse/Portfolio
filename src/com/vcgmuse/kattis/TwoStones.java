package com.vcgmuse.kattis;


public class TwoStones {
  public static void main(String[] args) {
    PrintWriterClass io = new PrintWriterClass(System.in, System.out);
    while (io.hasMoreTokens()) {
      int n = io.getInt();
      if (n % 2 == 0) {
        io.println("Bob");
      } else {
        io.println("Alice");
      }
    }
    io.close();
  }
}
