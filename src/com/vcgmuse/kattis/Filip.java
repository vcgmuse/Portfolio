package com.vcgmuse.kattis;


public class Filip {

  public static void main(String[] args) {
    PrintWriterClass io = new PrintWriterClass(System.in);

    while (io.hasMoreTokens()) {
      String one = io.getWord();
      String two = io.getWord();

      for (int i = one.length() - 1; i > 0; i--) {
        char test[] = one.toCharArray();
        char test2[] = two.toCharArray();

        if (test[i] != test2[i]) {

          if (test[i] > test2[i]) {
            StringBuilder oneOut = new StringBuilder(one);
            System.out.println(oneOut.reverse());
            break;
          } else {
            StringBuilder twoOut = new StringBuilder(two);
            System.out.println(twoOut.reverse());
            break;
          }
        }
      }
    }
  }
}

