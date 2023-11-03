package edu.upc.dsa;

import edu.upc.dsa.utils.Randomid;

import java.util.Enumeration;
import java.util.Hashtable;
import edu.upc.dsa.utils.Randomid;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class Partida {
    String id;
    Usuario Usuario;
    Juego Juego;
    public Partida(){
        this.id = Randomid.getId();
    }
    public Partida(Usuario Us, Juego Juego){
        this();
        this.setUsuario(Us);
        this.setJuego(Juego);
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id=id;
    }
    public Juego getJuego() {
        return this.Juego;
    }
    public void setJuego(Juego Juego) {
        this.Juego=Juego;
    }
    public Usuario getUsuario() {
        return this.Usuario;
    }
    public void setUsuario(Usuario Us) {
        this.Usuario=Us;
    }
}
