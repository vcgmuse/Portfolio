package com.vcgmuse.kattis;



public class EncodedMessage{
  public static void main(String[] args)  {

    PrintWriterClass io = new PrintWriterClass(System.in, System.out);
    int discard = io.getInt();
    while (io.hasMoreTokens()) {

      String text = io.getWord();
      StringBuilder answer = new StringBuilder();
      int sqrt = (int) Math.sqrt(text.length());
      int tracker = 0;
      int count = sqrt;
      while (tracker < sqrt) {
        int i = -1;
        int index = count;
        while (index <= text.length()) {
          answer.append(text.charAt(i + index));
          index += sqrt;
        }
        count--;
        tracker++;
        i++;
      }
      System.out.println(answer);
    }
  }
}