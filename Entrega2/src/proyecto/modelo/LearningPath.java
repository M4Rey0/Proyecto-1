package proyecto.modelo;

import java.util.ArrayList;
import java.util.Date;

public class LearningPath {

  private String titulo;
  private String descripcion;
  private String nivelDificultad;
  private int duracion;
  private float rating;
  private Date fechaCreacion;
  private Date fechaModificacion;
  private int version;
  private ArrayList<Actividad> actividades;
  
  public LearningPath(String titulo, String descripcion, String nivelDificultad, int duracion, float rating){
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.nivelDificultad = nivelDificultad;
    this.duracion = duracion;
    this.rating = rating;
    this.fechaCreacion = new Date();
    this.actividades = new ArrayList<Actividad>();
    this.version = 1;
    this.fechaModificacion = new Date();
  } 



  public void agregarTarea(Actividad actividad, String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, String descripcionTarea, String estadoEntrega){
    
    Tarea nuevaTarea = new Tarea(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador, descripcionTarea, estadoEntrega);

    actividades.add(nuevaTarea);
  }

  public void agregarExamen(Actividad actividad, String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas, String estadoEntrega){
    
    Examen nuevoExamen = new Examen(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador, preguntas, estadoEntrega);

    actividades.add(nuevoExamen);
  }

  public void agregarEncuesta(Actividad actividad, String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas){
    
    Encuesta nuevaEncuesta = new Encuesta(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador, preguntas);

    actividades.add(nuevaEncuesta);
  }

  public void agregarQuiz(Actividad actividad, String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas, float calificacionMinima){
    
    Quiz nuevoQuiz = new Quiz(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador, preguntas, calificacionMinima);

    actividades.add(nuevoQuiz);
  }

  public void agregarRecusoEducativo(Actividad actividad, String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, String tipo, String url){
    
    RecursoEducativo nuevoRecurso = new RecursoEducativo(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador, tipo, url);

    actividades.add(nuevoRecurso);
  }
  //getters & setters

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}
