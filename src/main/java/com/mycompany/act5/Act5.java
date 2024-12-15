/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act5;

import java.util.Random;

/**
 *
 * @author Eric Rodriguez
 */
public class Act5 {

    public static int menor (int a[]){
        
        int menor =a[0];
        
        for (int x = 0; x < 10; x++) {
            if (menor > a[x]){
                menor = a[x];
            }
        }
        return menor;
        
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100)+1;
            
            {
                  System.out.println("Los numeros generados son: ");
        for (int numero : numeros) {
            System.out.println(numero);
            
        }
                System.out.println("El numero menor es; "+menor(numeros));
    }
        }
    }
}
