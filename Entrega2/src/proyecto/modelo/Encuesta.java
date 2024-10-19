package proyecto.modelo;
import java.util.ArrayList;
import java.util.Date;

public class Encuesta extends Actividad{
	private ArrayList<String> preguntas;

	public Encuesta(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas){
		super(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador);
		this.preguntas = preguntas;
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}
	
}
