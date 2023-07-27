/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Karen -laptop-
 */
public class Catedratico extends Persona {
    public int id_catedratico;
    public int Horas_Clase;
    public String Curso_encargado;
    public String Grado_guia;
    public int Salario;
    
    public Catedratico(){
     super();
    }
    
    public Catedratico(int id, String nombre, String apellido, int edad, String direc, int tel, int id_catedratico,int hrs_clase,String curso,String grado_guia,int salario){
    super(id,nombre,apellido,edad,direc,tel);
    this.id_catedratico=id_catedratico;
    this.Horas_Clase=hrs_clase;
    this.Curso_encargado=curso;
    this.Grado_guia=grado_guia;
    this.Salario=salario;
    }
    
    public void darclases(){}

    /**
     * @return the id_catedratico
     */
    public int getId_catedratico() {
        return id_catedratico;
    }

    /**
     * @param id_catedratico the id_catedratico to set
     */
    public void setId_catedratico(int id_catedratico) {
        this.id_catedratico = id_catedratico;
    }

    /**
     * @return the Horas_Clase
     */
    public int getHoras_Clase() {
        return Horas_Clase;
    }

    /**
     * @param Horas_Clase the Horas_Clase to set
     */
    public void setHoras_Clase(int Horas_Clase) {
        this.Horas_Clase = Horas_Clase;
    }

    /**
     * @return the Curso_encargado
     */
    public String getCurso_encargado() {
        return Curso_encargado;
    }

    /**
     * @param Curso_encargado the Curso_encargado to set
     */
    public void setCurso_encargado(String Curso_encargado) {
        this.Curso_encargado = Curso_encargado;
    }

    /**
     * @return the Grado_guia
     */
    public String getGrado_guia() {
        return Grado_guia;
    }

    /**
     * @param Grado_guia the Grado_guia to set
     */
    public void setGrado_guia(String Grado_guia) {
        this.Grado_guia = Grado_guia;
    }

    /**
     * @return the Salario
     */
    public int getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
}