/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

/**
 * Alain Cesar Raymundo
 * @author elga0
 */
public class HolaMundo {

    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int temp = numero%2;
        
        if(temp == 0){
            System.out.println("el " +numero+ " es numero par");
        }else{
            System.out.println("el " +numero+ " es numero impar");
        }
    }
}
