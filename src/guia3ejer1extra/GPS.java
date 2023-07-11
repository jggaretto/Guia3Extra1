/*
mover() Este método generará una nueva Posición con valores aleatorios para la latitud
y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable
atributo “ultimaUbicacion”
- obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo
“ultimaUbicacion”
 */
package guia3ejer1extra;


public class GPS {
    private String marca;
    private String modelo;
    private Posicion ultimaUbicacion;

   public GPS(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mover() {
        double latitud = Math.random();
        double longitud = Math.random();
        this.ultimaUbicacion = new Posicion(latitud, longitud);
    }
    
    /**
     *
     * @return
     */
    public Posicion obtenerUltimaPosicion() {
        return this.ultimaUbicacion;
    }

}





