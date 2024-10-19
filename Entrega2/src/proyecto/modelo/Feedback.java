package proyecto.modelo;

public class Feedback {

  private String comentario;
  private int puntuacion;
  private String actividadID;
  private String nombreUsuario;


    //getters and setters
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getActividadID() {
        return actividadID;
    }

    public void setActividadID(String actividadID) {
        this.actividadID = actividadID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


  
}
