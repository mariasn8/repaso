package ej3;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class lambda {  //pasar a hexadecimal
    public static String baseN (int num, int base) {  //pasar a base n<10 con lambda
        String cambio="";
        cambio = Stream.iterate(num, n -> n/base)  //secuencia de la división de num/base
            .takeWhile(n -> n>0)
            .map(n -> n%base)  //coge el resto
            .map(n -> Integer.toString(n))  //cambia el resto a string
            .reduce("", (a,b) -> b+a);  //cambia el orden de los numeros, coge el ultimo resto y lo pone el primero

        return cambio;
    }

    public static String base16 (int num) {
        String cambio="";
        String caract="0123456789ABCDEF";
        cambio = Stream.iterate(num, n -> n/16)
                .takeWhile(n -> n>0)
                .map(n -> n%16)  //coge el resto
                .map(n -> Character.toString(caract.charAt(n)))  //cambia el resto a string
                .reduce("", (a,b) -> b+a);  //cambia el orden de los numeros, coge el ultimo resto y lo pone el primero
        //return String.valueOf(cambio);
        //return cambio.toString();
        return cambio;
    }

    public static String base16it (int num){  //iterativo
        String caract="0123456789ABCDEF";
        String cambio="";
        while(num>0){
            int resto=num%16;
            cambio = caract.charAt(resto) + cambio;  //pone el numero equivalente al resto
            num=num/16;
        }
        return cambio;
    }
}

    
