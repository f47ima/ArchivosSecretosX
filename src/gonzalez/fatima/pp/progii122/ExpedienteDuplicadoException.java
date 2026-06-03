package gonzalez.fatima.pp.progii122;

public class ExpedienteDuplicadoException extends IllegalArgumentException {

    public static String MESSAGE = "Expediente Duplicado";

    public ExpedienteDuplicadoException() {
        this(MESSAGE);
    }

    public ExpedienteDuplicadoException(String mensaje) {
        super(mensaje);
    }

}
