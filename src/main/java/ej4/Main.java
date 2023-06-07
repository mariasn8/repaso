package ej4;

public class Main {
    public static void main (String []args){
        System.out.println(palind.paliter("DABALEARROZALAZORRAELABAD"));  //25 letras
        System.out.println(palind.paliter("MARRAM"));
        System.out.println(palind.paliter("DABALEARROZALAZORRAELA"));

        System.out.println(palind.palrec("DABALEARROZALAZORRAELABAD"));
        System.out.println(palind.palrec("MARRAM"));
        System.out.println(palind.palrec("DABALEARROZALAZORRAELA"));
    }
}
