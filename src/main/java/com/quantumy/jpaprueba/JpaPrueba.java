package com.quantumy.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import logica.Alumno;
import logica.Controladora;

/**
 *
 * @author agent
 */
public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        /*Alumno alu = new Alumno(30,"Brandon","Santiago",new Date());
        control.crearAlumno(alu); */
        
        //control.eliminarAlumno(30);
        
        /*alu.setApellido("Hernandez");
        control.editarAlumno(alu);*/
        
        Alumno alu = control.traerAlumno(15);
        System.out.println("---------------------------- BUSQUEDA INDIVIDUAL");
        System.out.println("El alumno es: "+alu.toString());
        alu.setApellido("Salgado");
        control.editarAlumno(alu);
        System.out.println("---------------------------- BUSQUEDA DE TODOS");
        ArrayList<Alumno> listaAlumnos = control.traerAlumnos();
        for(Alumno item : listaAlumnos){
            System.out.println("El alumno es: "+item.toString());
        }
        System.out.println("---------------------------- ");
    }
}
