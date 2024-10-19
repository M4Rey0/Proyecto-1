package proyecto.modelo;

import java.util.ArrayList;

public class Profesor extends Usuario {

  private ArrayList<LearningPath> LearningPathsCreados;


  public Profesor(String idUsuario, String Hnombre, String email, String password){
    super(idUsuario, Hnombre, email, password);
    this.LearningPathsCreados = new ArrayList<>();
  }

  public void crearLearningPath(String titulo, String descripcion, String nivelDificultad, int duracion, float rating){

    LearningPath learningPathNuevo = new LearningPath(titulo, descripcion, nivelDificultad, duracion, rating);
    LearningPathsCreados.add(learningPathNuevo);
  } 
  
  public void modificarLearningPath(String titulo, String descripcion, String nivelDificultad, int duracion, float rating, LearningPath learningPath){
    learningPath.setTitulo(titulo);
    learningPath.setDescripcion(descripcion);
    learningPath.setNivelDificultad(nivelDificultad);
    learningPath.setDuracion(duracion);
    learningPath.setRating(rating);
    learningPath.setVersion(learningPath.getVersion() + 1);
    
  }
}
