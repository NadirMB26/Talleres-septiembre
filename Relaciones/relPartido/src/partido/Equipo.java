
package partido;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    private List<Jugador> jugadores;
    
    public Equipo(){
        this.jugadores = new ArrayList<>();
    }
    
    public Equipo(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }
    
    //Metodo para agregar un jugador
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    //Metodo para buscar un jugador por nombre
    public Jugador buscarJugador(String Nombre){
        return jugadores.stream()
                        .filter(jugador -> jugador.getNombre().equals(Nombre))
                        .findFirst()
                        .orElse(null);
    }
    
    //Metodo para eliminar un jugador
    
    public boolean eliminarJugador(Jugador jugador){
        return jugadores.remove(jugador);
    }
    
    //Metodo para eliminar todos los jugadores
    
    public void eliminarTodosLosJugadores(){
        jugadores.clear();
    }
}
