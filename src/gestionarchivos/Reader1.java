/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Reader1{
    public static void main(String[] args) throws Exception{
        File archivo = new File ("hamlet.txt");
        FileReader fr = new FileReader (archivo);
        String input;
        BufferedReader bin = new BufferedReader(fr);
        while ( (input = bin.readLine()) != null){
            System.out.println(input);
        }
    }
}


