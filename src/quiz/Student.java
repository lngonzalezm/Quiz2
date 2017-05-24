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
public abstract class Student extends Person{
   private String status;

    public Student(String status, String nombre, String Apellido, double salario) {
        super(nombre, Apellido, salario);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", Apellido=" + Apellido +
                ", salario=" + salario + '}'+"Student{" + "status=" + status + '}';
    }
   
   
   
}
