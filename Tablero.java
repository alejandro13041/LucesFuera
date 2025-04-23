import java.util.Random;

public class Tablero {
    private final int filas = 5;
    private final int columnas = 5;
    private Casilla[][] grid;

    public Tablero() {
        grid = new Casilla[filas][columnas];
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                grid[i][j] = new Casilla(rand.nextBoolean());
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void alternarCasillaYVecinos(int fila, int columna) {
        int[][] posiciones = {
            {fila, columna},
            {fila - 1, columna},
            {fila + 1, columna},
            {fila, columna - 1},
            {fila, columna + 1}
        };

        for (int[] pos : posiciones) {
            int f = pos[0];
            int c = pos[1];
            if (f >= 0 && f < filas && c >= 0 && c < columnas) {
                grid[f][c].alternar();
            }
        }
    }

    public boolean estaResuelto() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (grid[i][j].estaEncendida()) return false;
            }
        }
        return true;
    }
}
