public class Casilla {
    private boolean encendida;

    public Casilla(boolean encendida) {
        this.encendida = encendida;
    }

    public void alternar() {
        encendida = !encendida;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public String toString() {
        return encendida ? "1" : "0";
    }
}
