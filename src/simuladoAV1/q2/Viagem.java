package simuladoAV1.q2;


public class Viagem {
    private String destino;

    public Viagem(String destino) {

        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "destino='" + destino + '\'' +
                ']';
    }
}
