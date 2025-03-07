/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorempleados.Main;

import java.util.Scanner;

/**
 *
 * @author s0733
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeEmpleados gestor = new GestorDeEmpleados();
        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la edad: ");
                int edad = scanner.nextInt();
                System.out.print("Ingrese el salario: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                Empleado empleado = new Empleado(nombre, edad, salario);
                gestor.agregarEmpleado(empleado);
            } else if (opcion == 2) {
                gestor.mostrarEmpleados();
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida, intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}