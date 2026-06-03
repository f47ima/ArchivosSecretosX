package gonzalez.fatima.pp.progii122;

public class AvistamientoAereo extends Expediente implements Analizables {

    private final String ubicacion;

    public AvistamientoAereo(String codigo, String agenteSecreto, NivelSecreto nivelSecreto, String ubicacion) {
        super(codigo, agenteSecreto, nivelSecreto);
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return super.toString() + " Ubicacion=" + ubicacion + ']';
    }

    @Override
    public String analizar() {
        return "Se analizo el avistamiento aereo: " + super.getCodigo();
    }

}
