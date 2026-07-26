/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.experimentoconsola;
//linea creada después del commit y despues del push 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //libreria para el scanner
/**
 *
 * @author marcoFortonOchoa
 */
public class ExperimentoConsola {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Ingrese una cadena de palabras, puede ser nula: ");
        Scanner teclado = new Scanner(System.in);
        //El texto a probar sera: Mark-Toninooo Fort__Ochoaa!!
        String frase = teclado.nextLine();
        System.out.println("has escrito: "+frase);
        //teclado.nextLine();
//        System.out.println("Ingrese otra frase: ");
//        String frase1 = teclado.nextLine();
//        System.out.println("Has escrito: "+frase1);
        
        int longitud = frase.length();
        System.out.println("La long de la frase es: "+longitud);
        //String palabraAux = "";
        ArrayList listaPalMay5 = new  ArrayList <String>();
        StringBuilder sb = new StringBuilder();
        for (int cont=0; cont < longitud ; cont++){
            char letraAux = frase.charAt(cont);
            //System.out.println(letraAux);
            if(Character.isLetter(letraAux)){
                sb.append(letraAux);
                //supuestamente he agregado la letra a la palabra.
                System.out.println("linea 37 sb es: "+sb.toString());
                if((cont+1)==longitud&&sb.length()>=5){
                    listaPalMay5.add(sb.substring(0));
                }
            }else{
                if(sb.length()>=5){
                    listaPalMay5.add(sb.substring(0));
                    //aqui es cuando la palabra es larga
                    System.out.println("linea 42 listaPalMay5 es: "+listaPalMay5.toString());
                }else{
                    //letraAux es - y sb es Mark
                    //aqui es cuando es corta la palabra. Se vacia sb
                    //sb.setLength(0);
                    System.out.println("sb aquí debe vaciarse: "+sb.toString());
                }
                sb.setLength(0);
            }
        }
        System.out.println("La lista es la siguiente: ");
        System.out.println("Usando toString(): "+listaPalMay5.toString());
        for (int contador=0; contador < listaPalMay5.size(); contador++){
            System.out.println("Elemento["+contador+"]="+listaPalMay5.get(contador).toString());
        }
        System.out.println("En total son: "+listaPalMay5.size());
        //Esto guarda las letras: System.out.println("La palabra es: "+sb.toString());
        
        
        
    }
}
