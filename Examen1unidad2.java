/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1unidad2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen1unidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Scanner scaner = new (system.int)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del instrumento1 ");
        String Instrumento1 = scanner.nextLine();

        System.out.println("Ingresa el precio de compra del instrumento1");
        double Precio1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Ingresa el nombre del instrumento2");
        String Instrumento2 = scanner.nextLine();

        System.out.println("Ingresa el precio de compra del instrumento2");
        double Precio2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Ingresa el nombre del instrumento3");
        String Instrumento3 = scanner.nextLine();

        System.out.println("Ingresa el precio de compra del instrumento3");
        double Precio3 = scanner.nextDouble();

        double Producto1G = (1250.45 - Precio1);

        double Producto2G = (3743 - Precio2);

        double Productoinstrumento13G = (2683.78 - Precio3);
        scanner.close();

        double Producto1GP = (Producto1G / Precio1) * 100;
        double Producto2GP = (Producto2G / Precio2) * 100;
        double Producto3GP = (Producto1G / Precio3) * 100;

        System.out.println("El porcentaje de ganancia de " + Instrumento1 + " es de " + Producto1GP + "%");
        System.out.println("El porcentaje de ganancia de " + Instrumento2 + " es de " + Producto2GP + "%");
        System.out.println("El porcentaje de ganancia de " + Instrumento3 + " es de " + Producto3GP + "%");

    }

}