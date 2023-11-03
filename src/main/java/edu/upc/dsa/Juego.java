package edu.upc.dsa;

import edu.upc.dsa.utils.Randomid;

public class Juego {
    private String id;
    private String nombre;
    private String descripcion;
    private String niveles;
    public Juego() {
        this.id = Randomid.getId();
    }

    public Juego(String descripcion, String niveles) {
        this();
        this.setdescripcion(descripcion);
        this.setniveles(niveles);
    }
    public String getid() {
        return this.id;
    }
    public void setid(String id) {
        this.id=id;
    }

    public String getnombre() {
        return this.nombre;
    }
    public void setnombre(String nombre) {
        this.nombre=nombre;
    }
    public String getdescripcion() {
        return this.nombre;
    }
    public void setdescripcion(String nombre) {
        this.nombre=nombre;
    }
    public String getniveles() {
        return this.niveles;
    }
    public void setniveles(String niveles) {
        this.niveles=niveles;
    }
}
