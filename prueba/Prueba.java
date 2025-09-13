/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 * Alain Cesar Raymundo
 * @author elga0
 */
public class Prueba {

    public static void main(String[] args) {
        HolaMundo hm = new HolaMundo();
        hm.nombre = "Omar";
        hm.saludar("Ana");
    }
    
    public static class HolaMundo{
        String nombre = "John Doe";
        
        public void saludar(String nombre){
            this.nombre = nombre;
            System.out.println("Hola Mundo" + nombre);
        }
    }
}
