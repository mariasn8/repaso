package ej4;

public class Main {
    public static void main (String []args){
        System.out.println(Palind.paliter("DABALEARROZALAZORRAELABAD"));  //25 letras
        System.out.println(Palind.paliter("MARRAM"));
        System.out.println(Palind.paliter("DABALEARROZALAZORRAELA"));

        System.out.println(Palind.palrec("DABALEARROZALAZORRAELABAD"));
        System.out.println(Palind.palrec("MARRAM"));
        System.out.println(Palind.palrec("DABALEARROZALAZORRAELA"));
    }
}
