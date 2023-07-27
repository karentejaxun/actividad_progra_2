/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Karen -laptop-
 */
public class EmpleadoAdministrativo extends Persona {
    public int Id_empleado;
    public String Puesto;
    public int horastrabajo;
    public int Salario;
  
    public EmpleadoAdministrativo  (){
    super();
    }
    
    public EmpleadoAdministrativo(int id, String nombre, String apellido, int edad, String direc, int tel, int id_empleado, String puesto, int hrs_trabajo, int salario){
    super(id,nombre,apellido,edad,direc,tel);
    this.Id_empleado=id_empleado;
    this.Puesto=puesto;
    this.horastrabajo=hrs_trabajo;
    this.Salario=salario;
    }
    
    public void trabajar(){
    }

    /**
     * @return the Id_empleado
     */
    public int getId_empleado() {
        return Id_empleado;
    }

    /**
     * @param Id_empleado the Id_empleado to set
     */
    public void setId_empleado(int Id_empleado) {
        this.Id_empleado = Id_empleado;
    }

    /**
     * @return the Puesto
     */
    public String getPuesto() {
        return Puesto;
    }

    /**
     * @param Puesto the Puesto to set
     */
    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    /**
     * @return the horastrabajo
     */
    public int getHorastrabajo() {
        return horastrabajo;
    }

    /**
     * @param horastrabajo the horastrabajo to set
     */
    public void setHorastrabajo(int horastrabajo) {
        this.horastrabajo = horastrabajo;
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
