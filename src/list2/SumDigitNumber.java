package list2;

/**
 * 4 - Faça um programa em java fazendo uso da recursividade que solicite para o usuário digitar um número, em seguida,
 * faça a soma de todos os algarismos do número. Exemplos: 1981 = 1 + 9 + 8 + 1
 */

public class SumDigitNumber {

    private int sum = 0;

    public int sumDigits(int n) {
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
     return sum;
    }

    public int recursiveSum(int n){
        return (n == 0) ? 0 : recursiveSum(n/10) + (n % 10);
    }

    public void recursiveSumSimplerCode(int n){
        if(n == 0){
            System.out.println(sum);
        }else{
            sum += n % 10;
            recursiveSumSimplerCode(n / 10);
        }
    }
}
