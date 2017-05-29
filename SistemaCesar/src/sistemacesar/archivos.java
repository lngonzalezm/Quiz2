/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacesar;

import java.io.*;


/**
 *
 * @author Sergio y Camilo
 */
public class archivos {
    
    public static String leertxt(String direccion){
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
                       
            }
            
           texto = temp; 
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        return texto;
    }
    
    public static String d = leertxt("datos.txt");
}
