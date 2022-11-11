/*
 * 
Haz un script que reciba por parámetro al menos 4 nombres de persona y devuelva un saludo separado por comas del tipo “¡Hola Ana, Andrés, Juan, Manuel !”

 */

import java.util.*;

public class Ejercicio2{
    public static void main(String[] args){

        //Declaramos un array de Strings para almacenar os nombres.

        String[] arrayNombres = {"Luis", "Pepe", "María", "Carla"};

        //Con un bucle for recorremos el array imprimiendo en cada iteración los saludos.

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println("Hola " + arrayNombres[i]);            
        }

    }