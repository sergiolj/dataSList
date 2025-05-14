package list5.model;

/**
 * @date 2024/november
 * @author Sérgio Lopes Junior
 * @email sergiolj@gmail.com
 */

public interface LendRules {

    /*
     * Método a ser implementado pelas classes tornando possível que tipos diferentes
     * de itens da coleção tenham prazos de empréstimo diferentes.
     */
    int lendPeriod ();

    /*
     * Método para ser implementado caso sejam aplicadas multas sobre atraso.
     */
    double lateReturnFee();

}