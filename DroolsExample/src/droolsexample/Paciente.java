/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

/**
 *
 * @author Usuario
 */

public class Paciente {
    private int id;
    private String nombre;
    private int edad;
    private Sexo sexo; 
   
    public Paciente(int id, String nombre, int edad, Sexo sexo) {
        this.id=id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public Paciente() {
       super();
    }
    
    public int getId(){
    return id;
    }

    public void setId(int id){
    this.id= id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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
        final Paciente other = (Paciente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
    }

}
