package proyecto.modelo;
import java.sql.Time;
import java.util.ArrayList;


public class ProgresoPorActividad {

  private Float porcentajeCompletado;
  private ArrayList<Time> tiempoDedicado;
  private ArrayList<Boolean> tasasExitos;
  private String learningPath;

  //getters and setters

    public Float getPorcentajeCompletado() {
        return porcentajeCompletado;
    }

    public void setPorcentajeCompletado(Float porcentajeCompletado) {
        this.porcentajeCompletado = porcentajeCompletado;
    }

    public ArrayList<Time> getTiempoDedicado() {
        return tiempoDedicado;
    }

    public void setTiempoDedicado(ArrayList<Time> tiempoDedicado) {
        this.tiempoDedicado = tiempoDedicado;
    }

    public ArrayList<Boolean> getTasasExitos() {
        return tasasExitos;
    }

    public void setTasasExitos(ArrayList<Boolean> tasasExitos) {
        this.tasasExitos = tasasExitos;
    }

    public String getLearningPath() {
        return learningPath;
    }

    public void setLearningPath(String learningPath) {
        this.learningPath = learningPath;
    }

}
