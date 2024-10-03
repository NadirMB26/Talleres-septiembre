package carro;

import java.util.ArrayList;
import java.util.List;

class Coche {
    private List<Rueda> ruedas;
    // Constructor por defecto
    public Coche() {
       this.ruedas = new ArrayList<>();
    }
    // Constructor con Ruedas
    public Coche(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    // Método para agregar una rueda
    public void agregarRueda(Rueda rueda) {
        ruedas.add(rueda);
    }
    // Método para buscar una rueda por marca
    public Rueda buscarRueda(String marca) {
        return ruedas.stream()
                .filter(rueda-> rueda.getMarca().equals(marca))
                .findFirst()
                .orElse(null);
    }
 
    public boolean eliminarRueda(Rueda rueda) {
        return ruedas.remove(rueda);
    }
    // Método para eliminar todas las ruedas
    public void eliminarTodasLasRuedas() {
        ruedas.clear();
        fore
    }
}