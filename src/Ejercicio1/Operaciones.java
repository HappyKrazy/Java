package Ejercicio1;

public class Operaciones {

    private float longitud1;
    private float longitud2;

    public Operaciones(float longitud1, float longitud2) {
        this.longitud1 = longitud1;
        this.longitud2 = longitud2;
    }

    public Operaciones(float longitud1) {
        this.longitud1 = longitud1;
    }

    public float calcularPerimetro(){
        float perimetro = 2 * (longitud1 + longitud2);
        return perimetro;
    }

    public float calcularArea(){
        float area = (longitud1*longitud2);
        return area;
    }
}