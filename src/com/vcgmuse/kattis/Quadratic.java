package com.vcgmuse.kattis;

public class Quadratic {
    public static void main(String[] args) {
      PrintWriterClass io = new PrintWriterClass(System.in);
      int x = io.getInt();
      int y = io.getInt();
      if (x > 0) {
        if (y > 0) {
          System.out.println(1);
        } else {
          System.out.println(4);
        }
      } else if (x < 0) {
        if (y < 0) {
          System.out.println(3);
        } else {
          System.out.println(2);
        }
      }
    }
  }
