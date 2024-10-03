
package relacionescasa;


public class Casa {
    private Puerta puerta;
    
    public Casa(Puerta puerta){
        if (puerta == null){
            throw new IllegalArgumentException("Una casa no puede estar existir sin una puerta");
        }
        this.puerta = puerta;
    }
    
    //Metodo para agregar una nueva puerta
    public void cambiarPuerta(Puerta nuevaPuerta){
        if (nuevaPuerta == null) {
           throw new IllegalArgumentException("El procesador no puede ser nulo.");
        }
        this.puerta = nuevaPuerta;
    }
    
    //Metodo para buscar una puerta actual
    
    public Puerta obtenerPuerta(){
        return this.puerta;
    }
    
    //Metodo para eliminar la puerta (Lanzar excepcion si se intenta eliminar)
    public void eliminarPuerta(){
        throw new UnsupportedOperationException("No se puede eliminar la puerta o la casa dejaria de existir");
    }
}
