package proyecto.modelo;
import java.util.ArrayList;
import java.util.Date;	

public class Quiz extends Actividad {
	private ArrayList<String> preguntas;
	private Float calificacionMinima;


	public Quiz(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador, ArrayList<String> preguntas, float calificacionMinima){
		super(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador);
		this.preguntas = new ArrayList<String>();
		this.calificacionMinima = calificacionMinima;
	}

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public Float getCalificacionMinima() {
        return calificacionMinima;
    }

    public void setCalificacionMinima(Float calificacionMinima) {
        this.calificacionMinima = calificacionMinima;
    }


	
}
