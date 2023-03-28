package poc.testes.unitarios.projetoTestes.exception;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Divisão por zero não permitida.");
    }
}
