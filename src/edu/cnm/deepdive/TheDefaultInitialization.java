package edu.cnm.deepdive;

public class TheDefaultInitialization {

  static boolean myBoolean;
  static byte myBite;
  static short myShort;
  static int myInt;
  static long myLong;
  static float myFloat;
  static double myDouble;
  static char myChar;

  public static void main(String[] args) {
    int localInt;
    //System.out.println("localInt = " + localInt); gives a compilation error because a local variable
    //( = a variable that is declared within a method) needs to be initialized together with the declaration.

    System.out.println("myBoolean = " + myBoolean); //default false.
    System.out.println("myByte = " + myBite); //default 0.
    System.out.println("myShort = " + myShort); //default 0.
    System.out.println("myInt = " + myInt); //default 0.
    System.out.println("myLong = " + myLong); //default 0.
    System.out.println("myFloat = " + myFloat); //default 0.0
    System.out.println("myDouble = " + myDouble); //default 0.0
    System.out.println("myChar = " + myChar); //default null character. '\0' or 'u0000'
  }

}
