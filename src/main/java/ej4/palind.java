package ej4;

public class palind {
    //imprimir palabra, darle la vuelta e imprimir. Si son = palind, sino no palind
    public static boolean paliter(String palabra) { //devuelve true si es palíndromo; false si no lo es
        int n = palabra.length() - 1;  //ultima letra de la palabra    de 0 a 24 letras
        String x = palabra;
        String inv = "";
        for (int i = n; i >= 0; i--) {  //invierto la palabra
            inv += palabra.charAt(i);  //inv=inv+palabra.charAt(i);
        }
        System.out.println(inv);
        System.out.println(palabra);
        if (x.equals(inv)) {
            //System.out.println(" Es un palíndromo");
            return true;
        } else {
            //System.out.println(" No es un palíndromo");
            return false;
        }
        //System.out.println(palabra.charAt(i));  //imprime las letras de la palabra
        //for(int j=n; j>=0; j--){
                /*if(palabra.charAt(i)==palabra.charAt(j)){
                    c+=1;   //comprueba q todas las letras coincidan
                }*/
    }

    public static boolean palrec(String palabra) {  //return true si es un palíndromo; false si no lo es
        int n = palabra.length() - 1;
        String x = palabra;
        String inv = "";
        if (x.equals(inv)) {  //es un palind
            return true;
        } else
            return palrec();
    }
}
