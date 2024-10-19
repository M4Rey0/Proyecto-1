package proyecto.modelo;
import java.util.Date;

public class Tarea extends Actividad {
	private String  descripcionTarea;
	private String estadoEntrega;

	public Tarea(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String descripcionTarea, String creador, String estadoEntrega){
		super(titulo, descripcion, objetivo, nivelDificultad, duracion, fechaLimite, resultado, creador);
		this.descripcionTarea = descripcionTarea;
		this.estadoEntrega = "No entregado";
	}

	public String getDescripcionTarea() {
		return descripcionTarea;
	}

	public void setDescripcionTarea(String descripcionTarea) {
		this.descripcionTarea = descripcionTarea;
	}

	public String getEstadoEntrega() {
		return estadoEntrega;
	}

	public void setEstadoEntrega(String estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}
}
