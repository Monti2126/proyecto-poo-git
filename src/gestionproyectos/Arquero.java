public class Arquero {
    private String nombre;
    private int nivel;

    public Arquero(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void mostrarInfo() {
        System.out.println("Arquero: " + nombre + " Nivel: " + nivel);
    }
}