/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author USER
 */
public class Faculty extends Employee{

    public Faculty(int oficina, String FechaContratacion, String nombre,
            String Apellido, double salario) {
        super(oficina, FechaContratacion, nombre, Apellido, salario);
    }


    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", Apellido=" + Apellido + 
                ", salario=" + salario + '}'+"Faculty{" + '}';
    }
    
}
