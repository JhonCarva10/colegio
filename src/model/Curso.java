package model;

public class Curso {
    private int id;
    private String nombre;
    private String nombreDocente;

    public Curso(int id, String nombre, String nombreDocente) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDocente = nombreDocente;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNombreDocente() { return nombreDocente; }
}
