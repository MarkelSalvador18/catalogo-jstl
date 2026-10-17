package org.cuatrovientos.Cursos;

public class Curso {
    
    private int id;
    private String nombre;
    private int participantes;
    private int plazas;
    private int modulos;

    public Curso(int id, String nombre, int participantes, int plazas, int modulos) {
        this.id = id;
        this.nombre = nombre;
        this.participantes = participantes;
        this.plazas = plazas;
        this.modulos = modulos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getParticipantes() {
        return participantes;
    }

    public int getPlazas() {
        return plazas;
    }

    public int getModulos() {
        return modulos;
    }
    

}
