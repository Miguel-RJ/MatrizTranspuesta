package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte tamaño horizontal de la matriz: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Inserte tamaño vertical de la matriz: ");
        int y = scanner.nextInt();
        Matriz matriz = new Matriz(x,y);
        matriz.llenarMatriz();
        matriz.obtenerTranspuesta();
    }
}