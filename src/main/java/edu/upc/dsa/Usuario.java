package edu.upc.dsa;

import edu.upc.dsa.utils.Randomid;

import javax.print.DocFlavor;
import java.util.List;

public class Usuario {
    private String id;
    private String nombre;
    private String puntos;
    private Juego Juegoactual;
    private List<Partida> PartidasJugadas;
    private String nivel;
    private String Ingame;

    public Usuario() {
        this.id = Randomid.getId();
    }

    public Usuario(String nombre, String puntos) {
        this();
        this.setnombre(nombre);
        this.setpuntos(puntos);
        this.ingame();
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id=id;
    }

    public String getnombre() {
        return this.nombre;
    }
    public void setnombre(String nombre) {
        this.nombre=nombre;
    }
    public String getpuntos() {
        return this.puntos;
    }
    public static void setpuntos(String puntos) {
        this.puntos=puntos;
    }
    public String getnivel() {
        return this.nivel;
    }
    public static void setnivel(String nivel) {
        this.nivel=nivel;
    }
    public static void ingame(){
        this.Ingame =true;
    }
    public static void noingame(){
        this.Ingame =false;
        this.nivel=Integer.valueOf(0);
    }
    public static String getingame(){
        return this.Ingame;
    }


}
