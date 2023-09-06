/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejergithub_java_poo1;

/**
 *
 * @author FELIX
 */
public class Auto {
    String marca,modelo,empresa,proveedor;
    int precio,km,añoVenta;
    // metodos 
    public void Correr(){
        System.out.println("La marca del carro es " + marca + "su modelo del auto es :  " + modelo + " y su precio es : " + precio);
    }
    public void Frenar(){
        System.out.println("El " + marca + " freno al 0km");
    }
}
