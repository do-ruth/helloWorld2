
//import utility package to get scanner
import java.util.*;

/**
 * this is my first program (in a while)
 * I used a youtube tutorial showing step by step
 * to create the classic "Hello, World" programmers often make
 */

public class HelloWorld {
    public static void main(String[] args) {
        
        //defining variables
        String name;
        
        //add scanner
        Scanner mrScanner = new Scanner(System.in);
        
        //when starting up, system will announce
        System.out.println("Hello, World!");
        
        //system prompt user for their name
        System.out.println("What is your name?"):
        
        //store user name
        name = mrScanner.nextLine();
        
        //message to user
        System.out.println("Hi, ", name);
        
    }
}
