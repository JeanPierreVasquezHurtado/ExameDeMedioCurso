package Pregunta2;

import javax.swing.*;

public class InversaDeMatriz {

    private int matriz1[][];

    private int filaM1;

    private int columnaM1;

    private int valoresM1;

    private int matrizResultante[][];

    private int filaMR;

    private int columnaMR;

    public InversaDeMatriz()
    {
        Boolean validar = true;

        do {

            if (validar == false){
                JOptionPane.showMessageDialog(null, "No ingresaste el mismo valor de columnas y matrices, intentalo de nuevo: ");
                validar = true;
            }
            filaM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar fila de la Matriz "));

            columnaM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna de la Matriz "));

            this.matriz1 = new int[filaM1][columnaM1];

            filaMR = filaM1;
            columnaMR = columnaM1;
            this.matrizResultante = new int[filaMR][columnaMR];


            if (columnaM1 != filaM1){
                validar = false;
            }

        }while (columnaM1 != filaM1);
        JOptionPane.showMessageDialog(null, "Muy bien, ingresaste el mismo valor de columnas  y filas , continuemos :) ");
    }


    public void agregarMatriz() {
        for (int fila = 0; fila < this.matriz1.length; fila++) {
            for (int columna = 0; columna < this.matriz1[fila].length; columna++) {
                this.valoresM1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz 1"));

                this.matriz1[fila][columna] = this.valoresM1;
            }
        }
    }

    public void mostrarMatriz()
    {
        System.out.println("Matriz");
        for(int fila=0; fila < this.matriz1.length; fila++)
        {

            for(int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz1[fila][columna]);
            }

            System.out.println();
        }
        System.out.println();
    }

    public void inversaM()
    {
        for (int i = 0; i < filaMR; i++) {
            for (int j = 0; j < columnaMR; j++) {
                matrizResultante[i][j] = matriz1[j][i];

            }
        }

        System.out.println("la matriz inversa es:       ");
        for (int i = 0; i < this.matrizResultante.length; i++) {
            for (int j = 0; j < this.matrizResultante.length; j++) {
                System.out.print(matrizResultante[i][j] + "  ");
            }
            System.out.println("        ");

        }
    }
}
