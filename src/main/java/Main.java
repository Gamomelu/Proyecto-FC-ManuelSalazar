/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ManuelSalazar
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de Datos:
        // Operaciones: Lecturas desde la entrada estándar (sc.nextLine() y sc.nextInt()).
        // Complejidad: O(1) ya que estas operaciones no dependen del tamaño de la matriz.
        System.out.println("Ingrese los caracteres que desea imprimir separados por espacios:");
        String[] caracteres = sc.nextLine().split(" ");
        System.out.println("Ingrese el tamaño de la matriz:");
        int tamano = sc.nextInt();
        sc.close();

        // Inicialización de ambas Matrices:
        // Operaciones: Dos bucles anidados para inicializar ambas matrices con valores predeterminados.
        // Complejidad: O(tamano^2), donde tamano es el tamaño de la matriz.
        String[][] matrizA = new String[tamano][tamano];
        String[][] matrizB = new String[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matrizA[i][j] = " ";
                matrizB[i][j] = " ";
            }
        }

        // Construcción de ambas Matrices:
        // Operaciones: Dos bucles anidados para llenar ambas matrices según las opciones seleccionadas.
        // Complejidad: O(tamano^2), donde tamano es el tamaño de la matriz.
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <= i; j++) {
                matrizA[i][j] = caracteres[j % caracteres.length];
            }

            for (int j = 0; j < tamano - i; j++) {
                matrizB[i][j] = caracteres[i % caracteres.length];
            }
        }

        // Impresión de ambas Matrices:
        // Operaciones: Dos bucles anidados para imprimir ambas matrices.
        // Complejidad: O(tamano^2), donde tamano es el tamaño de la matriz.
        System.out.println("Triángulo A:");
        imprimirMatriz(matrizA);

        System.out.println("\nTriángulo B:");
        imprimirMatriz(matrizB);
    }

    private static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
