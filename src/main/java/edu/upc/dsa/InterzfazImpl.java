package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class InterzfazImpl implements Interfaz {
    private static Interfaz instance;
    List<Juego> LJuego;
    List<Partida> LPartidas;
    List<Usuario> LUsuarios;

    final static Logger logger = Logger.getLogger(TracksManagerImpl.class);
    public static InterfazImpl getInstance() {
        if (instance==null) instance = new InterfazImpl();
        return instance;
    }
    private InterfazImpl() {
        this.LJuego = new ArrayList<>();
        this.LPartidas = new ArrayList<>();
        this.LUsuarios = new ArrayList<>();
    }
    //Para simplificar las cosas haremos que las id se assignen automaticamente a la hora de crear un juego nuevo.
    public Juego Newgame(Juego t) {
        logger.info("new game " + t);

        this.LJuego.add (t);
        logger.info("new game added");
        return t;
    }
    public Juego NuevoJuego(String descripcion, String niveles) {
        return this.Newgame(new Juego(descripcion, niveles));
    }
    public static DameJuego(String id) {
        logger.info("getgame("+id+")");

        for (Juego t: this.LJuego) {
            if (t.getid().equals(id)) {
                logger.info("getgame("+id+"): "+t);

                return t;
            }
        }

        logger.warn("not found " + id);
        return null;
    }
    //Ahora haremos una partida
    public Partida Nuevapartida(Partida P) {
        logger.info("new partida " + P);

        this.LPartidas.add(P);
        logger.info("new partida added");
        return P;
    }
    public Partida NuevaP(Usuario U, Juego J) {
        if ((U.getingame().equals(true)) && (J.getid().equals(null)){
            logger.warm("El Usuario ya ha iniciado una partida o el juego no existe");
        }
        else{
            Usuario.setpuntos(String.valueOf(50));
            U.setnivel(String.valueOf(1));
            U.ingame();
            return this.Nuevapartida(new Partida(U, J));
            logger.info(U+"ha iniciado una partida en"+J);
        }
        return this.Nuevapartida(new Partida(U, J));
    }
    public String NivelUsuario(Usuario U){
        String nivel=U.getnivel();
        if (nivel.equals(0) || (nivel==null)){
            logger.warm("No se ha encontrado al Usuario o no esta en partida");
        }
        else{
            logger.info(U+"es de nivel"+nivel);
        }
        return nivel;
    }
    public Usuario Cambiodenivel(Usuario U, int p,){
        
    }

}
