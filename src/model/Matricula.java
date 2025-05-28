package model;

public class Matricula {

    private String nombreEstudiante;
    private String nombreCurso;
    private float nota;

    public Matricula(String nombreEstudiante, String nombreCurso, float nota) {
        this.nombreEstudiante = nombreEstudiante;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public String getNombreEstudiante() { return nombreEstudiante; }
    public String getNombreCurso() { return nombreCurso; }
    public float getNota() { return nota; }
}
