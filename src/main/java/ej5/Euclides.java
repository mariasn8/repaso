package ej5;
import java.util.stream.*;

public class Euclides {
    public static int eucrec (int m, int n){
        if(m>n) {
            int r = m % n;
            if (r == 0)
                return n;  //el MCD es n
            else
                return eucrec(n, r);
        }
        else  //si m<n
            return 0;  //no se puede hacer
    }

    public static int euciter (int m, int n){
        if (m > n) {
            int r=m % n;  //para la 1ª vuelta
            while (r != 0) {
                m = n;
                n = r;
                r = m % n;
            }
            return n;
        }
        else  //si m < n
            return 0;  //no se puede hacer
    }


    public static int euclambda (int m, int n){
        return Stream.iterate(new int [] {m, n}, x -> new int [] {x[1], x[0] % x[1]})  // sería n y r
                .filter(x -> x[1] == 0)  //si el resto es 0
                .findFirst()  //coge el primero cuyo resto sea 0
                .map(x -> x[0])  //coge el primer numero
                .get(); //coge el valor
    }

}
