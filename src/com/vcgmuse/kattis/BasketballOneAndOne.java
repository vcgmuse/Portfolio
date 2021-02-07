package com.vcgmuse.kattis;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketballOneAndOne {

    //Fields
    int aScore = 0;
    int bScore = 0;

    //Objects
    public static Scanner scanner =
        new Scanner(System.in);

    //methods
    public char[] setCharArray() {
      String temp = scanner.next();
      char container[] = temp.toCharArray();
      return container;
    }

    public char winner() {
      if (aScore > bScore) {
        return 'A';
      } else {
        return 'B';
      }
    }

    public void setChar(char cha[]) {
      int i = 0;
      int j = 1;
      while (i < cha.length) {
        if (cha[i] == 'A'){
          aScore += cha[j];
        } else {
          bScore += cha[j];
        }
        i += 2; j+=2;
      }
    }
    public static void main (String[]args){
      BasketballOneAndOne game = new BasketballOneAndOne();
      game.setChar(game.setCharArray());
      System.out.println(game.winner());
    }
  }
