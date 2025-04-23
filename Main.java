import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del jugador: ");
        String nombre = sc.nextLine();
        Jugador jugador = new Jugador(nombre);
        Tablero tablero = new Tablero();

        while (!tablero.estaResuelto()) {
            tablero.mostrar();
            System.out.print("Fila (0-4): ");
            int fila = sc.nextInt();
            System.out.print("Columna (0-4): ");
            int columna = sc.   nextInt();
            jugador.jugar(tablero, fila, columna);
        }

        System.out.println("¡Felicidades, " + jugador.getNombre() + "! Has ganado en " + jugador.getMovimientos() + " movimientos.");
        sc.close();
    }
}
