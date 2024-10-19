package proyecto.modelo;

import java.util.ArrayList;

public class Estudiante extends Usuario {

  private ArrayList<ProgresoPorActividad> ProgresoActividades;
  private ArrayList<LearningPath> learningPaths;


  public Estudiante(String idUsuario, String Hnombre, String email, String password){
    super(idUsuario, Hnombre, email, password);
    this.ProgresoActividades = new ArrayList<>();
    this.learningPaths = new ArrayList<>();
  }

  public void inscribirLearningPath(LearningPath learningPath){
    learningPaths.add(learningPath);
  }
}
