package ej5;

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
        //Stream.iterate()
        return 0;
    }

}
