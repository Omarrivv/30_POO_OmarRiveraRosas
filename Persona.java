/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejergithub_java_poo1;

/**
 *
 * @author FELIX
 */
public class Persona {
    String nombre,apellido,ubicacion,trabajo;
    int edad,salario;
    // metodo
    public void Caminar(){
        System.out.println("Yo soy " + nombre + " " + apellido + " Y trabajo en " + trabajo + " Y vivo en : " + ubicacion);
    }
    public void Hablar(){
        System.out.println("Yo puedo Habblar");
    }
}
