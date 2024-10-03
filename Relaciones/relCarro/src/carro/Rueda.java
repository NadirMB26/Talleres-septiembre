package carro;

class Rueda {
    private String marca;
    
    public Rueda(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
       return marca;
    }
}
 // Clase Todo: Coche que tiene Ruedas (agregación)
 
 // Método para eliminar una rueda