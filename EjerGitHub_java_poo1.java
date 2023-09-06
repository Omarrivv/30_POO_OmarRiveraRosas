/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejergithub_java_poo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FELIX
 */
public class EjerGitHub_java_poo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Animales animal1 = new Animales();
        Animales animal2 = new Animales();
        animal1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal "));
        animal1.nombreAve = JOptionPane.showInputDialog("Ingrese el nombre para esta ave : ");
        animal1.especieAve = JOptionPane.showInputDialog("Ingrese la especie de este animal");
        animal1.Comer();
        animal1.Dormir();
        animal2.nombreAve = "Alcon";
        animal2.especieAve = "Volador Y Salvaje";
        animal2.Comer();
        animal2.Dormir();
        Persona persona1 = new Persona();
        System.out.println("Ingrese su nombre: ");
        persona1.nombre = entrada.nextLine();
        persona1.apellido = "Rivera Rosas";
        persona1.edad = 17;
        persona1.salario = 5000;
        System.out.println("Ingrese el lugar donde trabaja : ");
        persona1.trabajo = entrada.nextLine();
        System.out.println("Ingrese su Ubicacion : ");
        persona1.ubicacion = entrada.nextLine();
        persona1.Hablar();
        persona1.Caminar();
        calculadora calculadora1 = new calculadora();
        System.out.println("Ingrese el valor para a : ");
        calculadora1.a = entrada.nextInt();
        System.out.println("Ingrese el valor para b : ");
        calculadora1.b = entrada.nextInt();
        calculadora1.multiplicar();
        Auto auto1mini = new Auto();
        auto1mini.precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este auto : "));
        auto1mini.empresa = JOptionPane.showInputDialog("Ingrese el precio de este auto : ");
        auto1mini.marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
        auto1mini.Correr();
        auto1mini.Frenar();
    }
}

