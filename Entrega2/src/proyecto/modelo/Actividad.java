package proyecto.modelo;

import java.util.Date;
import java.util.ArrayList;

public class Actividad {

    private String titulo;
    private String creador;
    private String descripcion;
    private String objetivo;
    private String nivelDificultad;
    private int duracion;
    private Date fechaLimite;
    private int resultado;
    private ArrayList<Actividad> actividadesSugeridas;
    private ArrayList<Actividad> prerrequisitos;

    //Constructor
    public Actividad(String titulo, String descripcion, String objetivo, String nivelDificultad, int duracion, Date fechaLimite, int resultado, String creador) {
        this.creador = creador;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.nivelDificultad = nivelDificultad;
        this.duracion = duracion;
        this.fechaLimite = fechaLimite;
        this.resultado = resultado;
        this.actividadesSugeridas = new ArrayList<Actividad>();
        this.prerrequisitos = new ArrayList<Actividad>();
    }


    //Getters
    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Actividad> getActividadesSugeridas() {
        return actividadesSugeridas;
    }

    public void setActividadesSugeridas(ArrayList<Actividad> actividadesSugeridas) {
        this.actividadesSugeridas = actividadesSugeridas;
    }

    public ArrayList<Actividad> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(ArrayList<Actividad> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }
    
}
