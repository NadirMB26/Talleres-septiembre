
package matrimonio;

public class Matrimonio {
    
    private Persona persona;
    private Evento evento;
   
    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarInvitacion() {
        System.out.println(persona.getNombre() + " está invitado(a) al evento " + evento.getNombre());
    }
}
