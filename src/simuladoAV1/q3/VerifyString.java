package simuladoAV1.q3;

public class VerifyString {

    //O algoritmo passa uma palavra inteira e vai retirando um caracter de cada lado
    //da palavra e enviando para a recursão, quando ele não conseguir correspondência entre os caracteres
    //ele sai do loop

    public static boolean isPalindromo(String palavra){
        // //s+ busca por espaços em branco na string e o método replaceALL substitui esses por nada.
        palavra = palavra.replaceAll("\\s+", "");
        palavra = palavra.toLowerCase();
     if(palavra.length() <= 1){
         return true;
     }
     if(palavra.charAt(0) == palavra.charAt(palavra.length()-1)){
         return isPalindromo(palavra.substring(1,palavra.length()-1));
     }else{
         return false;
     }
    }
}
