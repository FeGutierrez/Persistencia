/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
public class DataInput2{
   public static void main(String[] args) throws Exception{
        String file = args[0];
        DataInputStream din = new DataInputStream(new FileInputStream(file));
        double data;
         try{
            while (true){
                data = din.readDouble();
                System.out.println(data);
            }
        }
        catch (EOFException eofe){}
        din.close();}}



