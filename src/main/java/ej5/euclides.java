package ej5;

public class euclides {
    public static int eucrec (int m, int n){
        if(m<n){
            return 0;  //no se puede hacer
        }
        if(m%n==0){
            return n;  //el MCD es n
        }
        else{
            int r=m%n;
            return eucrec(n,r);
        }
    }

    public static int euciter (int m, int n){
        if(m<n)
            return 0;  //no se puede hacer
        int r=m%n;

        return 0;
    }

}
