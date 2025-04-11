package simuladoAV1.q3;

public class SomaDigitos {

    public static int somaDig(int num) {
        if(num < 10) {
            return num;
        }
        //Quando eu divido um inteiro em java não retorna erro, apenas retorna a parte inteira do resultado
        //11/10 = 1,1 logo 1 o ",1" é descartado porque não é inteiro
        return (num % 10) + somaDig(num / 10);
    }
}
