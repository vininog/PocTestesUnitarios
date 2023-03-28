package poc.testes.unitarios.projetoTestes.exception;

public class NegativeDeltaException extends RuntimeException {
    public NegativeDeltaException() {
        super("Resultado de delta é negativo, portanto, não existem raizes reais!");
    }
}
