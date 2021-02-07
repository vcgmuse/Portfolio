package com.vcgmuse.kattis;

import javax.sound.midi.SysexMessage;

public class Faktor {
  public static void main(String[] args) {
    //PrintWriterClass was already created from another problem and used here.Adjuste int y = io.getInt();
    PrintWriterClass io = new PrintWriterClass(System.in, System.out);
    int x = io.getInt();
    int y = io.getInt();
    int z = 0;

    z = x * (y - 1);
    io.println(z+1);
    io.close();
  }
}