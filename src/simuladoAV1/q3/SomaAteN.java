package simuladoAV1.q3;

public class SomaAteN {

    public static int somaRec(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somaRec(num - 1);
    }
}
