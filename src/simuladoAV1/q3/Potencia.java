package simuladoAV1.q3;

public class Potencia {

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, exponente - 1);
    }
}

