/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        University universidad = new University("Universidad Nacional", "datos.txt");
        System.out.println("Lista de Personas: ");
        universidad.ListarPersonas();
        System.out.println("Salario total de los gerentes: ");
        universidad.datosSalarioGerente();
        System.out.println("Salario Total: ");
        universidad.salarioTotal();
        
    }
    
    
}
