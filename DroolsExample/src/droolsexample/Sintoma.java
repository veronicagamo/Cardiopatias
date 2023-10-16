/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

/**
 *
 * @author Usuario
 */

public class Sintoma {
    private int id;
    private int idPaciente;
    private TipoSintoma tipo;
    
       public Sintoma(int id, int id_paciente, TipoSintoma tipo) {
        this.id = id;
        this.idPaciente = id_paciente;
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

    public void setIdPaciente(int id_paciente) {
        this.idPaciente = id_paciente;
    }


    public TipoSintoma getTipo() {
        return tipo;
    }

    public void setTipo(TipoSintoma tipo) {
        this.tipo = tipo;
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
        final Sintoma other = (Sintoma) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Sintoma [id=" + id + ", id_paciente=" + idPaciente + ", tipo=" + tipo + "]";
    }
}
