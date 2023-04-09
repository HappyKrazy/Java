package Ejercicio2;

public class Tablero {
    private int y;
    private int x;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Tablero(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public void moverArriba(int n){
        y = y + n;
    }
    public void moverAbajo(int n){
        y = y - n;
    }
    public void moverIzquierda(int n){
        x = x - n;
    }
    public void moverDerecha(int n){
        x = x + n;
    }
}
