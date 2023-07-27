/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Karen -laptop-
 */
public class Alumno extends Persona {
    public int Carne_Estudiante;
    public String Horario_clases;
    public String Grado;
    public int Notas;
 
    public Alumno(){
    super();
    }
    
    public Alumno(int id, String nombre, String apellido,int edad,String direc,int tel,int carne,String horario, String grado,int notas){
    super(id,nombre,apellido,edad,direc,tel);
    this.Carne_Estudiante=carne;
    this.Horario_clases=horario;
    this.Grado=grado;
    this.Notas=notas;
    
    }
    
    public void estudiar(){
    }

    /**
     * @return the Carne_Estudiante
     */
    public int getCarne_Estudiante() {
        return Carne_Estudiante;
    }

    /**
     * @param Carne_Estudiante the Carne_Estudiante to set
     */
    public void setCarne_Estudiante(int Carne_Estudiante) {
        this.Carne_Estudiante = Carne_Estudiante;
    }

    /**
     * @return the Horario_clases
     */
    public String getHorario_clases() {
        return Horario_clases;
    }

    /**
     * @param Horario_clases the Horario_clases to set
     */
    public void setHorario_clases(String Horario_clases) {
        this.Horario_clases = Horario_clases;
    }

    /**
     * @return the Grado
     */
    public String getGrado() {
        return Grado;
    }

    /**
     * @param Grado the Grado to set
     */
    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    /**
     * @return the Notas
     */
    public int getNotas() {
        return Notas;
    }

    /**
     * @param Notas the Notas to set
     */
    public void setNotas(int Notas) {
        this.Notas = Notas;
    }
    
   
}
