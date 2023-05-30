package org.example;

import java.util.Scanner;

public class Matriz {
    int [][] original;
    public int horizontal;
    public int vertical;
    public Matriz(int horizontal, int vertical){
        this.horizontal = horizontal;
        this.vertical = vertical;
        original = new int[this.vertical][this.horizontal];
    }

    public void llenarMatriz(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vertical; i++){
            for (int j = 0; j < horizontal; j++){
                System.out.println("Inserte valor de ["+ i + "," + j +"]");
                original[i][j] = scanner.nextInt();
            }
        }
    }

    public void obtenerTranspuesta(){
        int[][] matrizTranspuesta = new int[horizontal][vertical];
        obtenerTranspuestaRecursiva(matrizTranspuesta,0, 0);
        System.out.println("Matriz original: \n ");
        imprimirMatriz(original);
        System.out.println("Matriz transpuesta: \n");
        imprimirMatriz(matrizTranspuesta);
    }

    public void obtenerTranspuestaRecursiva(int[][] transpuesta, int hor, int ver){
        if (hor == this.horizontal){
            return;
        }

        transpuesta[hor][ver] = original[ver][hor];

        if (ver == this.vertical - 1){
            obtenerTranspuestaRecursiva(transpuesta, hor + 1, 0);
        }
        else{
            obtenerTranspuestaRecursiva(transpuesta, hor, ver + 1);
        }
    }

    public void imprimirMatriz(int[][] m){
        for (int i = 0; i <= m.length - 1; i++){
            for (int j = 0; j <= m[0].length - 1; j++){
                System.out.print(m[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
