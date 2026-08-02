/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.experimentoconsola;

import java.util.ArrayList;
import java.util.Scanner; 
/**
 *
 * @author marcoFortonOchoa
 */
public class ExperimentoConsola {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Ingrese una cadena de palabras, puede ser nula: ");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        System.out.println("has escrito: "+frase);
        int longitud = frase.length();
        ArrayList listaPalMay5 = new  ArrayList <String>();
        StringBuilder sb = new StringBuilder();
        for (int cont=0; cont < longitud ; cont++){
            char letraAux = frase.charAt(cont);
            if(Character.isLetter(letraAux)){
                sb.append(letraAux);
                if((cont+1)==longitud&&sb.length()>=5){
                    listaPalMay5.add(sb.substring(0));
                }
            }else{
                if(sb.length()>=5){
                    listaPalMay5.add(sb.substring(0));
                sb.setLength(0);
            }
        }
        System.out.println("La lista es la siguiente: ");
        System.out.println("Usando toString(): "+listaPalMay5.toString());
        for (int contador=0; contador < listaPalMay5.size(); contador++){
            System.out.println("Elemento["+contador+"]="+listaPalMay5.get(contador).toString());
        }
        System.out.println("En total son: "+listaPalMay5.size());
       
    }
}
