// Criada na Atividade 7 - Cenário D (desafio)
public class ErroAoSalvarPedidoException extends RuntimeException {

    public ErroAoSalvarPedidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
