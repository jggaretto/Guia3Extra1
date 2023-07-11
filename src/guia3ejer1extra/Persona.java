
package guia3ejer1extra;

public class Persona {
    private String apellido;
    private String nombre;
    private GPS gps;
    
    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setApellido(String ape) {
        this.apellido = ape;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void ubicarme(GPS gps) {
        this.gps = gps;
        this.gps.mover();
        Posicion ultimaPosicion = this.gps.obtenerUltimaPosicion();
        System.out.println("Mi última posición es:");
        System.out.println("Latitud: " + ultimaPosicion.getLatitud());
        System.out.println("Longitud: " + ultimaPosicion.getLongitud());
    }
}
