package proyecto.modelo;
import java.util.Date;

public class RecursoEducativo extends Actividad {
	private String tipoRecurso;
	private String urlRecurso;
 
	public	 RecursoEducativo(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String tipoRecurso, String urlRecurso, String creador){
		super(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador);
		this.tipoRecurso = tipoRecurso;
		this.urlRecurso = urlRecurso;
	}

	public String getTipoRecurso() {
		return tipoRecurso;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	public String getUrlRecurso() {
		return urlRecurso;
	}

	public void setUrlRecurso(String urlRecurso) {
		this.urlRecurso = urlRecurso;
	}
}
