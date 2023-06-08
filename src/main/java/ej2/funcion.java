package ej2;

public class funcion {
    //la función muestra los múltiplos del número. Un nombre sería multiplos2
    public static void frec (int num, int div){
        if(num>1){
            if((num%div)==0){
                System.out.println(div);
                frec(num/div,div);
            }
            else
                frec(num,div+1);
        }
    }

    public static void fiter (int num, int div) {
        if (num > 1) {
            for (int i = div; i <= num; i++) {
                if ((num % i) == 0) {
                    System.out.println(i);
                    num = num / i;
                    i--; // ¿?
                }
            }
        }
    }


    public static void main (String[] args){
        frec(30,2);
        fiter(30,2);
    }

    public static void flamb (int num, int div){

    }
}
