package simuladoAV1.q3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Potencia.calcularPotencia(2,2));
        System.out.println(Potencia.calcularPotencia(2,3));
        System.out.println(Potencia.calcularPotencia(2,4));

        System.out.println(SomaAteN.somaRec(3));
        System.out.println(SomaAteN.somaRec(2));

        System.out.println(VerifyString.isPalindromo("ave"));
        System.out.println(VerifyString.isPalindromo("Ovo"));

        System.out.println(SomaDigitos.somaDig(11));

    }
}
