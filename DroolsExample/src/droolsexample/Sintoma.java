/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author Usuario
 */

public class Sintoma {
    private UUID id;
    private int idPaciente;
    private TipoSintoma tipo;
    
       public Sintoma(UUID id, int id_paciente, TipoSintoma tipo) {
        this.id = id;
        this.idPaciente = id_paciente;
        this.tipo = tipo;
    }
       
         public Sintoma(UUID id, TipoSintoma tipo) {
        this.id = id;
        this.tipo = tipo;
    }
 public Sintoma( TipoSintoma tipo) {
        this.tipo = tipo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }
    @Override
    public String toString() {
        return "Sintoma [id=" + id + ", id_paciente=" + idPaciente + ", tipo=" + tipo + "]";
    }
    
    
}
