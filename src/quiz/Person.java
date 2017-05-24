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
public abstract class Person {
 protected String nombre;
 protected String Apellido;
 protected double salario;
private String NomRevelado;
private String ApRevelado;
private char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K',
    'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
private int aux;
private char aux2;
        
    public Person(String nombre, String Apellido, double salario) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.salario = salario;
    }
 
    // metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String RevelarNombre(String Nombre){

    String s = Nombre;
    NomRevelado = "";
    int[] equivnumerico1 = new int[s.length()];
    int[] equivnumerico2 = new int[s.length()];
    for(int i=0;i<s.length();i++){
        for(int j=0;j<25;j++){
                if(Nombre.charAt(i) == caracteres[j])
                {
                equivnumerico1[i] = j;
                break;
                }
        }
    }

    for(int k=0;k<s.length();k++){                                        	
    aux = equivnumerico1[k];

        if (aux < 4){
                aux = aux + 26;
        }
        equivnumerico2[k] = (aux-3)%26;
    }

    for(int l=0;l<s.length();l++){
        for(int m=0;m<25;m++){
                if(equivnumerico2[l] == m){
                aux2 = caracteres[m];
                NomRevelado = NomRevelado + aux2;
                break;
                }
        }                                     	
    }
    return NomRevelado;
    }
    public String RevelarApellido(String Apellido){
	
	String s = Apellido;
        ApRevelado = "";
	int[] equivnumerico1 = new int[s.length()];
	int[] equivnumerico2 = new int[s.length()];  
    	
	for(int i=0;i<s.length();i++){
            for(int j=0;j<25;j++){
                if(Apellido.charAt(i) == caracteres[j])
                {
                equivnumerico1[i] = j;
                break;
                }
            }
	}
	
	for(int k=0;k<s.length();k++){                                        	
    	aux = equivnumerico1[k];
    	equivnumerico2[k] = (aux-3)%26;
	}
	
	for(int l=0;l<s.length();l++){
            for(int m=0;m<25;m++){
                if(equivnumerico2[l] == m){
                aux2 = caracteres[m];
                ApRevelado = ApRevelado + aux2;

                }
            }//Revelacion del texto
	}
  
	return ApRevelado;
	}
    

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", Apellido=" + Apellido + 
                ", salario=" + salario + '}';
    }
    
    
}
