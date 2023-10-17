/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

/**
 *
 * @author Usuario
 */
public class Pruebas {
     private int id;
    private int idPaciente;
    private EnumPruebas tipo;
      public Pruebas(int id, int idPaciente, EnumPruebas tipo) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.tipo = tipo;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
    public int getIdPaciente() {
        return idPaciente;
    }

   
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }


    public EnumPruebas getTipo() {
        return tipo;
    }


    public void setTipo(EnumPruebas tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Pruebas{" +
               "id=" + id +
               ", idPaciente=" + idPaciente +
               ", tipo=" + tipo +
               '}';
    }
}
