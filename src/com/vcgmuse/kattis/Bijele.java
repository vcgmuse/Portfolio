package com.vcgmuse.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bijele {

  private static final int NUM_PCS[] = {1, 1, 2, 2, 2, 8};

  public static Scanner scanner =
      new Scanner(System.in);

  public static List<Integer> differaPc = new ArrayList<>();

  public StringBuilder asseble(List<Integer> differaPc) {
    StringBuilder assembled = new StringBuilder();
    for (Integer list : differaPc) {
      assembled.append(list + " ");
    }
    return assembled;
  }

  public void difference() {
    int i = 0;
    while (scanner.hasNext()) {
      int value = scanner.nextInt();
      if (value <= 0) {
        differaPc.add(NUM_PCS[i]);
      } else if (NUM_PCS[i] >= value) {
        differaPc.add(NUM_PCS[i] - value);
      } else if (NUM_PCS[i] <= value) {
        differaPc.add(-(value - NUM_PCS[i]));
      }
      i++;
    }
  }

  public static void main(String[] args) {
    Bijele practise = new Bijele();
    practise.difference();
    System.out.println(practise.asseble(differaPc));
  }
}


