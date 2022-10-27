package edu.biel.segundaSemana;

public class myclass  {
    public static void main (String [] args) {
        String primeiroNome = "Gabriel";
        String segundoNome  = "Bernardo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

 }
        public static String nomeCompleto(String primeiroNome, String segundoNome) { 
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}

