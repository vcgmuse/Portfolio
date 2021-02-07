package com.vcgmuse.kattis;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

  public class FreeFood {

    private static Scanner scanner = new Scanner(System.in);
    private static Set<Integer> daysOfFreeFood = new TreeSet<>();

    public static void setDaysOfFreeFood(int start, int end) {
      for (int i = start; i <= end; i++) {
        FreeFood.daysOfFreeFood.add(i);
      }
    }

    public static void main(String[] args) {
      while (scanner.hasNext()) {
        int eventDays = scanner.nextInt();
        while (eventDays > 0) {
          eventDays--;
          FreeFood.setDaysOfFreeFood(scanner.nextInt(), scanner.nextInt());
        }
        System.out.println(daysOfFreeFood.size());
        daysOfFreeFood.clear();
      }
    }
  }

