package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Escriba la opcion: " +
                "" +
                "\n1. Arriba" +
                "\n2. Abajo" +
                "\n3. Izquierda" +
                "\n4. Derecha"));
        Tablero tab = new Tablero(0,0);
        int n;
        do {
            switch (opc){
                case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverArriba(n);
                    break;
                case 2:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverAbajo(n);
                    break;
                case 3:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverIzquierda(n);
                    break;
                case 4:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverDerecha(n);
                    break;
            }
            System.out.println("Posicion Actual: (Y:"+tab.getY()+",X:"+tab.getX()+")");
        } while (opc==5);
        System. exit(0);
    }
}
