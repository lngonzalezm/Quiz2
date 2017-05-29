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
public class InformacionDesencriptada {
    
    public int i = 0;
   
        public String lector = archivos.d;
        public String tipo = "";
        public int SalarioTotal = 0;
        public int SalarioGerentes = 0;
          
         public void mostrarTexto()   
         {
 
                for(int j=1;j<=30;j++)
                {
                tipo = "";
                Student.Nombre = "";
                Student.Apellido = "";
                Student.status = "";
                Student.Salario = 0;
                Faculty.Rango = "";
                Faculty.oficina = "";
                Faculty.FechaContratacion = "";
                Faculty.Nombre = "";
                Faculty.Apellido = "";
                Faculty.Salario = 0;
                Staff.titulo = "";
                Staff.oficina = "";
                Staff.FechaContratacion = "";
                Staff.Nombre = "";
                Staff.Apellido = "";
                Staff.Salario = 0;
                
                while(lector.charAt(i) != ',') 
                {
                    tipo = tipo + lector.charAt(i);
                    i=i+1;
                }
                
                i=i+1;
                if("STUDENT".equals(tipo))
                {
                    
                    while(lector.charAt(i) != ',')
                    {
                        Student.Nombre = Student.Nombre + lector.charAt(i);
                        i=i+1;
                    }
                    Student.Nombre = Desencriptador.Revelar(Student.Nombre);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Student.Apellido = Student.Apellido + lector.charAt(i);
                        i=i+1;
                    }
                    Student.Apellido = Desencriptador.Revelar(Student.Apellido);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Student.status = Student.status + lector.charAt(i);
                        i=i+1;
                    }
                    Student.status = Desencriptador.Revelar(Student.status);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Student.Salario = lector.charAt(i) - 48;
                        i=i+1;
                    }
                    i=i+1;
                    SalarioTotal = SalarioTotal + Student.Salario;
                    System.out.println(tipo + "," + Student.Nombre + "," + Student.Apellido + "," + Student.status + "," + Student.Salario + ",");
                   
                }
                
                if("FACULTY".equals(tipo))
                {
                  
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.Rango = Faculty.Rango + lector.charAt(i);
                        i=i+1;
                    }
                    Faculty.Rango = Desencriptador.Revelar(Faculty.Rango);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.oficina = Faculty.oficina + lector.charAt(i);
                        i=i+1;
                    }
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.FechaContratacion = Faculty.FechaContratacion + lector.charAt(i);
                        i=i+1;
                    }
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.Nombre = Faculty.Nombre + lector.charAt(i);
                        i=i+1;
                    }
                    Faculty.Nombre = Desencriptador.Revelar(Faculty.Nombre);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.Apellido = Faculty.Apellido + lector.charAt(i);
                        i=i+1;
                    }
                    Faculty.Apellido = Desencriptador.Revelar(Faculty.Apellido);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Faculty.Salario = lector.charAt(i) - 48;
                        i=i+1;
                    }
                    i=i+1;
                    SalarioTotal = SalarioTotal + Faculty.Salario;
                    System.out.println(tipo + "," + Faculty.Rango + "," + Faculty.oficina + "," + Faculty.FechaContratacion + "," + Faculty.Nombre + "," + Faculty.Apellido + "," + Faculty.Salario);
                   
                }
                
                if("STAFF".equals(tipo))
                {
                           
                    while(lector.charAt(i) != ',')
                    {
                        Staff.titulo = Staff.titulo + lector.charAt(i);
                        i=i+1;
                    }
                    i=i+1;
                    Staff.titulo = Desencriptador.Revelar(Staff.titulo);
                    
                    while(lector.charAt(i) != ',')
                    {
                        Staff.oficina = Staff.oficina + lector.charAt(i);
                        i=i+1;
                    }
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Staff.FechaContratacion = Staff.FechaContratacion + lector.charAt(i);
                        i=i+1;
                    }
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Staff.Nombre = Staff.Nombre + lector.charAt(i);
                        i=i+1;
                    }
                    Staff.Nombre = Desencriptador.Revelar(Staff.Nombre);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Staff.Apellido = Staff.Apellido + lector.charAt(i);
                        i=i+1;
                    }
                    Staff.Apellido = Desencriptador.Revelar(Staff.Apellido);
                    i=i+1;
                    
                    while(lector.charAt(i) != ',')
                    {
                        Staff.Salario = lector.charAt(i) - 48;
                        i=i+1;
                    }
                    i=i+1;
                    SalarioTotal = SalarioTotal + Staff.Salario;
                    if("GERENTE".equals(Staff.titulo))
                    {
                        SalarioGerentes = SalarioGerentes + Staff.Salario;
                    }
                    System.out.println(tipo + "," + Staff.titulo + "," + Staff.oficina + "," + Staff.FechaContratacion + "," + Staff.Nombre + "," + Staff.Apellido + "," + Staff.Salario);
                    
                }
                
                }   
                
                System.out.println("El salario total de los gerentes es:" + " " + SalarioGerentes);
                System.out.println("El salario total de los empleados es:" + " " + SalarioTotal);
                
            
         }   
}
