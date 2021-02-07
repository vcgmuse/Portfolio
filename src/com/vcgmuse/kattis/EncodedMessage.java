package com.vcgmuse.kattis;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class PrintWriterClass extends PrintWriter {
  public PrintWriterClass(InputStream i) {
    super(new BufferedOutputStream(System.out));
    r = new BufferedReader(new InputStreamReader(i));
  }

  public PrintWriterClass(InputStream i, OutputStream o) {
    super(new BufferedOutputStream(o));
    r = new BufferedReader(new InputStreamReader(i));
  }

  public boolean hasMoreTokens() {
    return peekToken() != null;
  }

  public int getInt() {
    return Integer.parseInt(nextToken());
  }

  public double getDouble() {
    return Double.parseDouble(nextToken());
  }

  public long getLong() {
    return Long.parseLong(nextToken());
  }

  public String getWord() {
    return nextToken();
  }


  private BufferedReader r;
  private String line;
  private StringTokenizer st;
  private String token;

  private String peekToken() {
    if (token == null)
      try {
        while (st == null || !st.hasMoreTokens()) {
          line = r.readLine();
          if (line == null)
            return null;
          st = new StringTokenizer(line);
        }
        token = st.nextToken();
      } catch (IOException e) {
      }
    return token;
  }

  private String nextToken() {
    String ans = peekToken();
    token = null;
    return ans;
  }
}

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