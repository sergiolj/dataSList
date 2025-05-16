package Av1.q2;

public class MultplicaAteN {

    public static int somaRec(int num) {
        if (num == 1) {
            return 1;
        }
        return num * somaRec(num - 1);
    }
}
