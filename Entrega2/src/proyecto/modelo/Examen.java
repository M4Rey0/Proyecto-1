package proyecto.modelo;
import java.util.ArrayList;
import java.util.Date;
public class Examen extends Actividad{
	private ArrayList<String> preguntas;
	private String estadoEntrega;

	public Examen(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas, String estadoEntreg){
		super(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador);
		this.preguntas = preguntas;
		this.estadoEntrega = "No entregado";
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}

	public String getEstadoEntrega() {
		return estadoEntrega;
	}

	public void setEstadoEntrega(String estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}
}
