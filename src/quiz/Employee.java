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

public abstract class Employee extends Person {
	public int oficina;
	public String FechaContratacion;

    public Employee(int oficina, String FechaContratacion, String nombre,
            String Apellido, double salario) {
        super(nombre, Apellido, salario);
        this.oficina = oficina;
        this.FechaContratacion = FechaContratacion;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(String FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", Apellido=" + Apellido +
                ", salario=" + salario + '}'+"Employee{" + "oficina=" + oficina 
                + ", FechaContratacion=" + FechaContratacion + '}';
    }
        
}
    

