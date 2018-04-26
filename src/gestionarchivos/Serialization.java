/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;

import java.io.*;
public class Serialization{
    public static void main(String[] args) throws Exception{
        String flag = args[0]; 
        String file = args[1];
        Person c = new Person("F", "G");
        Person d;
        if (flag.equals("-w")){
            ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(new File(file)));
            out.writeObject(c);
        }
        else if (flag.equals("-r")){
            ObjectInputStream in =
                new ObjectInputStream(new FileInputStream(new File(file)));
            System.out.println("Reading serialized object");
            d = (Person) in.readObject();
            System.out.println(d.getFirstName() + "," + d.getLastName());
            }}}


