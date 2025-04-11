package simuladoAV1.q1;

public class Main{
    public static void main(String[] args) {
        var network = new SocialNetworkDS<User>("Rede Social Estrutura de Dados");
        var u1 = new User("Sergio", 51);

        network.add(u1);
        network.update(u1);
        network.remove(u1);
        System.out.println(network);
    }
}