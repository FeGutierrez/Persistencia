package gestionarchivos;

import java.io.*;
import java.util.*;
public class HoursWorked {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours.dat"));
        process(input);
    }
    public static void process(Scanner input) {
        while (input.hasNext()) {
            String name = input.next();
            double sum = 0.0;
            while (input.hasNextDouble()) {
                sum += input.nextDouble();
            }
            System.out.println("Total hours worked by " + name
                    + " = " + sum);
        }
    }
}
