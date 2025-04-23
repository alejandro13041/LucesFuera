public class Jugador {
    private String nombre;
    private int movimientos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.movimientos = 0;
    }

    public void jugar(Tablero tablero, int fila, int columna) {
        tablero.alternarCasillaYVecinos(fila, columna);
        movimientos++;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public String getNombre() {
        return nombre;
    }
}
