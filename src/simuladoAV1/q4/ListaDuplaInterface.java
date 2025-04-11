package simuladoAV1.q4;

public interface ListaDuplaInterface <T>{
    boolean adicionarInicio(T elemento);
    boolean adicionarFim(T elemento);
    boolean removerFim();
    boolean removerInicio();

}
