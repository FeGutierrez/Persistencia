/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;

// Variation of Hello2 that prints to a file.
import java.io.*;

public class Hello4 {
    public static void main(String[] args)
            throws FileNotFoundException {
        PrintStream output
                = new PrintStream(new File("hello.txt"));
        output.println("Hello world.");
        output.println();
        output.println("This program produces four");
        output.println("lines of output.");
        output.format("%d", 5);
    }
}


