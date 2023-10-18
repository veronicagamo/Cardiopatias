/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package droolsexample;

/**
 *
 * @author Usuario
 */
public class Diagnostico {
    private int id;
    private int idPac;
    private int score;
    private EnumCredibilidad credibilidad;
    private boolean cardiopatia;
    private TipoCardiopatia tipo;
    private Gravedad gravedad;
    private String comentario;
    
    public Diagnostico(int id, int idPac) {
        this.id = id;
        this.idPac = idPac;
    }
    
    public Diagnostico(int id, int idPac, int score, EnumCredibilidad credibilidad, boolean cardiopatia, TipoCardiopatia tipo, Gravedad gravedad, String comentario) {
        this.id = id;
        this.idPac = idPac;
        this.score = score;
        this.credibilidad = credibilidad;
        this.cardiopatia = cardiopatia;
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.comentario = comentario;
    }
    
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPac() {
        return idPac;
    }

    public void setIdPac(int idPaciente) {
        this.idPac = idPaciente;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public EnumCredibilidad getCredibilidad() {
        return credibilidad;
    }

    public void setCredibilidad(EnumCredibilidad credibilidad) {
        this.credibilidad = credibilidad;
    }

    public boolean getCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public TipoCardiopatia getTipo() {
        return tipo;
    }

    public void setTipo(TipoCardiopatia tipo) {
        this.tipo = tipo;
    }
     public Gravedad getGravedad() {
        return gravedad;
    }

    public void setGravedad(Gravedad gravedad) {
        this.gravedad = gravedad;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    @Override
    public String toString() {
        return "Diagnostico{" +
                "id=" + id +
                ", idPac=" + idPac +
                ", score=" + score +
                ", credibilidad=" + credibilidad +
                ", cardiopatia=" + cardiopatia +
                ", tipo=" + tipo +
                ", gravedad=" + gravedad +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
