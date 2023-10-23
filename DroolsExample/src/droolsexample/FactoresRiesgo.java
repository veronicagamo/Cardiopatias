/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

/**
 *
 * @author Usuario
 */

public class FactoresRiesgo {
    private int id;
    private int idPacient; 
    private EnumFRiesgo factorRiesgo;

    public FactoresRiesgo(int id, int idPacient, EnumFRiesgo factorRiesgo) {
        this.id = id;
        this.idPacient = idPacient;
        this.factorRiesgo = factorRiesgo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPacient() {
        return idPacient;
    }

    public void setIdPacient(int idPacient) {
        this.idPacient = idPacient;
    }

    public EnumFRiesgo getFactorRiesgo() {
        return factorRiesgo;
    }

    public void setFactorRiesgo(EnumFRiesgo factorRiesgo) {
        this.factorRiesgo = factorRiesgo;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FactoresRiesgo other = (FactoresRiesgo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
  @Override
    public String toString() {
        return "FactoresRiesgo{" +
                "id=" + id +
                ", id_paciente=" + idPacient +
                ", factorRiesgo=" + factorRiesgo +
                '}';
    }

    void add(FactoresRiesgo factoresRiesgo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
}
