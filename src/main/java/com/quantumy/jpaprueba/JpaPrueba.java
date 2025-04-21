package com.quantumy.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.Controladora;
import logica.Materia;

/**
 *
 * @author agent
 */
public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        /*Alumno alu = new Alumno(30,"Brandon","Santiago",new Date());
        control.crearAlumno(alu); 
        
        //control.eliminarAlumno(30);
        
        /*alu.setApellido("Hernandez");
        control.editarAlumno(alu);*/
        /*
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
        System.out.println("---------------------------- ");*/
        //Crear lista de materias y agregar 
         LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
         
         Carrera carre = new Carrera('2',"Tecnico en programacion",listaMaterias);
         //Guardar Carrear en DB
        control.crearCarrera(carre);
        //Crear Materias
        Materia mate1 = new Materia(1,"Programacio I","Cuatrimestral",carre);
        Materia mate2 = new Materia(2,"Programacio II","Cuatrimestral",carre);
        Materia mate3 = new Materia(3,"Programacio Avanzada","ANAUL",carre);
        
        //guardar en DB
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
       
        //Agregar a lista de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
       
      
       
        //Crear alumno con carrera()
        Alumno alu = new Alumno(32,"Luis","HERNANDEZ",new Date(),carre);
        //Guardar alumno en db
        control.crearAlumno(alu); 
        //Vemo el resultado
        System.out.println("-------------------------");
        System.out.println("---------DATOS ALUMNO-----------");
        Alumno alu2 = control.traerAlumno(32);
        System.out.println("Alumno: "+alu2.getNombre() + " " + alu2.getApellido());
        System.out.println("Cursa la carrear de : "+alu2.getCarre().getNombre());
    }
}
