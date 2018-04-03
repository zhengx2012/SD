package com.skilldistillery.datatypes.drills;

public class DeclaringPrimitives {

  public static void main(String[] args) {
    // Declare a byte variable and assign the value 128. What happens? Assign it a valid value.
    byte b = 127;
    // Create a switch statement for your variable.
    switch (b) {
    case 127: System.out.println("127!!");;
    case -128: System.out.println("what?");
    case 0: System.out.println("ohh ");
    case 'A': System.out.println("uhhh");
//    case 128: System.out.println("nope");
//    case \u0000: System.out.println("nada");
    
    }
    // Have a case for each of the values 127, -128, 0, 'A', 128, '\u0000'.
    // Which values cause compiler errors? A, 128, \u0000 & 0 are the same, so only one per switch
    
    
    // Declare a int variable and assign it a value.
    int i = 100;
    
    // Again create a switch statement.
    // Have a case for each of the values 127, -128, 'A', 128, '\u0000'.
    switch (i) {
    case 127: System.out.println("127!!");;
    case -128: System.out.println("what?");
    case 'A': System.out.println("uhhh");
    case 128: System.out.println("nope");
    case '\u0000': System.out.println("nada");
    
    }

  }

}
