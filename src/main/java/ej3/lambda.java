package ej3;
import java.util.*;

public class lambda {  //pasar a hexadecimal
    public static ArrayList<Integer> baseB(int num, int base) {
        ArrayList<Integer> lista = new ArrayList();
        while (num > 0 && base < 10) {
            lista.add(num % base);
            num = num / base;
        }
        //return lista;  //lista de restos
        lista.stream()
                .sorted(Comparator.reverseOrder())  //ordena los num d mayor a menor
                .forEach(n -> System.out.print(n));
        return lista;
    }

    /*public static ArrayList<Integer> lambda (int num, int base) {
        ArrayList<Integer> resul;
        resul = baseB(12837, 7);  //llama a baseB
        resul.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n));
        return resul;
    } */
}

    
