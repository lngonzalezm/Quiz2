/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class University {
    private String nombre;
    private String path;
    private Scanner entrada;
    private ArrayList<Person> personas;

    public University(String nombre, String path) throws FileNotFoundException {
        this.nombre = nombre;
        this.path = path;
        this.personas = new ArrayList<>();
        this.entrada = new Scanner(new File(path));
    }
    public void agregarPerson(Person p) {
        this.personas.add(p);
    }
    public void ListarPersonas(){
        while (entrada.hasNextLine()) {
            String sig = entrada.next();
            if (sig.equalsIgnoreCase("STUDENT")) {
                this.agregarPerson(new Student(entrada.next(), entrada.next(),
                         entrada.next(),entrada.nextInt()) {});
            } else if (sig.equalsIgnoreCase("FACULTY")) {
                this.agregarPerson(new Faculty(entrada.nextInt(), entrada.next(), entrada.next(), 
                        entrada.next(), entrada.nextDouble()));
            } else if (sig.equalsIgnoreCase("STAFF")) {
                this.agregarPerson(new Staff(entrada.next(), entrada.nextInt(),
                        entrada.next(), entrada.next(), entrada.next(), entrada.nextInt()));
            } 
            entrada.nextLine();
        }
    }
    public double datosSalarioGerente() {
    double salarioGerentes = 0;
    salarioGerentes = personas.stream().filter((persona) 
        -> (persona instanceof Staff)).map((persona) 
        -> (Staff) persona).filter((a) 
        -> ("GERENTE".equals(a.getTitulo()))).map((a) 
        -> a.getSalario()).reduce(salarioGerentes, (accumulator, _item) 
        -> accumulator + _item);
    return salarioGerentes;
    }

    public double salarioTotal(){
        double salarioTotal=0;
        salarioTotal = personas.stream().map((persona) 
            -> persona.getSalario()).reduce(salarioTotal, (accumulator, _item) 
            -> accumulator + _item);
        return salarioTotal;
    }

}
