/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiante
 */
public class Archivos {
    
                
    public Image loadImage(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    public static void main(String[] args) {
        
        File carpetaprueba = new File("carpeta prueba");
        File carpeta2 = new File("carpeta2");
        if (!carpetaprueba.exists()) {
            carpetaprueba.mkdir();
        } else {
            System.out.println("carpeta ya existente");
        }
        
        
        
        File archivo = new File("carpeta/o.txt");
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado");
                }
            } catch (IOException ex) {
                System.out.println("Prohibido crear el archivo");
            }
        } else {
//            System.out.println("Tamaño: "+ archivo.length() + " bytes");
//            System.out.println("Ruta: " + archivo.getAbsolutePath());
//            System.out.println("¿Es archivo?: " + archivo.isFile());
            if (carpeta2.isDirectory()) {
                String[] lista = carpeta2.list();
                System.out.println("Lista de archivos");
                    for (String lista1 : lista) {
                            System.out.println(lista1);
                    }
            } else {
                try {
                    Scanner lecturaArchivo = new Scanner(archivo);
                    while (lecturaArchivo.hasNextInt()) { 
                        System.out.println(lecturaArchivo.nextInt());
                       
                    }
                } catch (FileNotFoundException ex) {
                        
                }
            }
        }
        
        

    }  
}


    


