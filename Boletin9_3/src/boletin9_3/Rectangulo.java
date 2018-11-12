/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Rectangulo {
    private float base;
    private float altura;
    
    public float calcularArea(){
        boolean correcto = false;
        do{
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base del rectángulo:"));
        if(num1 > 0){
            base = num1;
            correcto = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
        }
        }while(correcto == false);
        correcto = false;
        do{
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura del rectángulo"));
        if(num2 > 0){
            altura = num2;
            correcto = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
        }
        }while(correcto == false);
        return base * altura;
    }
}
