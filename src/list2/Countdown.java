package list2;

/**
 * 6 - Escreva uma função recursiva que imprima uma contagem regressiva a partir de um número inteiro
 * positivo fornecido como entrada.
 */
public class Countdown {

    public enum Method {
        FOR, RECURSIVE, RTERNARY
    }

    private String countdownFor(int n) {
        StringBuilder stb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            stb.append(i).append("-> ");
        }
        stb.append("0 !!");
        return stb.toString();
    }

    private String countdownRec(int n) {
        if (n == 0) {
            return "0 !!";
        }
        return (n + "-> " ) + countdownRec(n - 1);
    }

    private String countdownRecTernary(int n) {
        return (n == 0) ? "0 !!" : (n + "-> " ) + countdownRecTernary(n - 1);
    }

    public String countDown(int n, Method method) {
        return switch (method) {
            case FOR -> countdownFor(n);
            case RECURSIVE -> countdownRec(n);
            case RTERNARY -> countdownRecTernary(n);
            default -> countdownRec(n);
        };
    }
}
