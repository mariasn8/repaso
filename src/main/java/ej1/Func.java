package ej1;

public class Func {
    public static void main (String []args){
        Func xUno=new Func();  //crea un objeto
        System.out.println(f(2));

        System.out.println(bisect(0,2));

        System.out.println(xUno.biseciter(0,2));
    }

    //static final double N = 2;  //constante
    static final double PREC = 1e-8;

    static double f (double x) {
        return x*x-2;
    }
    static double bisect (double min, double max) {
        double med = (min+max)/2;
        if (max-min<PREC) {
            return med;
        } else if (f(min)*f(med)<0) {
            return bisect (min,med);
        } else {
            return bisect (med,max);
        }
    }

    public double biseciter (double min, double max) {
        double med=0;
        for(int i=1; ((max-min)>PREC) ; i++){
            med=(max+min)/2;
            if(f(min)*f(med)<0){
                max=med;
            }
            else{
                min=med;
            }
        }
        return med;
    }
}
