/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Contador {
      public void grupoNumeros(){
          double num;
          int contCeros = 0;
          int contPositivos = 0;
          int contNegativos = 0;
          for(int i = 0; i < 10; i++){
              num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
              if(num > 0){
                  contPositivos++;
              }
              else if(num < 0){
                  contNegativos++;
              }
              else{
                  contCeros++;
              }
          }
          JOptionPane.showMessageDialog(null, "Números positivos: " 
               + contPositivos + "\nNúmeros negativos: " 
               + contNegativos + "\nCeros: " + contCeros);
      }
//    private double[] numeros = new double[10]; 
//    
//    public void grupoNumeros(){
//        for(int i = 0; i < numeros.length; i++){
//            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
//        }
//    }
//    
//    public int contadorCeros(){
//        int contador = 0;
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] == 0){
//                contador++;
//            }
//        }
//        return contador;
//    }
//    
//    public int contadorPositivos(){
//        int contador = 0;
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] > 0){
//                contador++;
//            }
//        }
//        return contador;
//    }
//    
//    public int contadorNegativos(){
//        int contador = 0;
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] < 0){
//                contador++;
//            }
//        }
//        return contador;
//    }
//    
//    public void resultado(){
//        JOptionPane.showMessageDialog(null, "Números positivos: " 
//                + this.contadorPositivos() + "\nNúmeros negativos: " 
//                + this.contadorNegativos() + "\nCeros: " + this.contadorCeros());
//    }
    
     
}
