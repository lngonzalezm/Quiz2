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
public class Staff extends Employee{
    private String titulo;

    public Staff(String titulo, int oficina, String FechaContratacion, String nombre, String Apellido, double salario) {
        super(oficina, FechaContratacion, nombre, Apellido, salario);
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    public String getTitulo() {
            return titulo;
        }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", Apellido=" + Apellido +
                ", salario=" + salario + '}'+"Staff{" + "titulo=" + titulo + '}';
    }

}
