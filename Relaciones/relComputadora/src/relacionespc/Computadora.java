package relacionespc;


// Clase Todo: Computadora que se compone de un Procesador
class Computadora {
    private Procesador procesador;
    // Constructor que recibe Procesador
    public Computadora(Procesador procesador) {
       if (procesador == null) {
       throw new IllegalArgumentException("Una computadora no puede existir sin un procesador.");
    }
       this.procesador = procesador;
    }
    
    // Método para agregar un nuevo procesador
    public void cambiarProcesador(Procesador nuevoProcesador) {
        if (nuevoProcesador == null) {
            throw new IllegalArgumentException("El procesador no puede ser nulo.");
        }
        this.procesador = nuevoProcesador;
    }
    
    // Método para buscar el procesador actual
    public Procesador obtenerProcesador() {
        return this.procesador;
    }
    // Método para eliminar el procesador (lanzar excepción si se intenta eliminar)
    public void eliminarProcesador() {
        throw new UnsupportedOperationException("No se puede eliminar el procesador. La computadora dejaríade existir.");
    }
}
