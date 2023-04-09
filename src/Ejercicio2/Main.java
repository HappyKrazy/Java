package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Tablero tab = new Tablero(0,0);
        int opc;
        int n;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escriba la opcion: " +
                    "" +
                    "\n1. Arriba" +
                    "\n2. Abajo" +
                    "\n3. Izquierda" +
                    "\n4. Derecha" +
                    "\n5. Salir"));

            switch (opc) {
                case 1 -> {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverArriba(n);
                }
                case 2 -> {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverAbajo(n);
                }
                case 3 -> {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverIzquierda(n);
                }
                case 4 -> {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad que desea moverse: "));
                    tab.moverDerecha(n);
                }
            }
            System.out.println("Posicion Actual: (Y:"+tab.getY()+",X:"+tab.getX()+")");
        }while(opc!=5);
        System. exit(0);
    }
}
