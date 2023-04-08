package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Operaciones op;
        float la1, la2;

        la1 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el lado 1"));
        la2 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el lado 2"));

        if(la1 == la2){
            op = new Operaciones(la1);
        }
        else{
            op = new Operaciones(la1,la2);
        }

        System.out.println("El perimetro del cuadrilatero es: " +op.calcularPerimetro());
        System.out.println("El area del cuadrilatero es: " +op.calcularArea());

    }
}
