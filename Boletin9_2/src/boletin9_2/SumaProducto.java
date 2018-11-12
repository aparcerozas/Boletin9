/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author aparcerozas
 */
public class SumaProducto {
    public int suma(){
        int suma = 0;
        int contador = 10;
        for(int i = 10; i < 90; i++){
            suma = suma + contador;
            contador++;
        }
        return suma;
    }
    
    public double producto(){
        double producto = 1;
        int contador = 10;
        for(int i = 0; i < 80; i++){
            producto = producto * contador;
            contador++;
        }
        return producto;
    }
}
