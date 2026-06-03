package gonzalez.fatima.pp.progii122;

public class RegistroRadar extends Expediente implements Reportables, Analizables {

    private final int altitudDetectada;

    public RegistroRadar(String codigo, String agenteSecreto, NivelSecreto nivelSecreto, int altitudDetectada) {
        super(codigo, agenteSecreto, nivelSecreto);
        this.altitudDetectada = altitudDetectada;
    }
    @Override
    public String toString() {
        return super.toString() + " altitudDetectada=" + altitudDetectada+ ']';
    }

    @Override
    public String reportar() {
        return "Reporte de radar: " + super.getCodigo() + ". Altitud detectada: " + altitudDetectada + " metros.";
    }


    @Override
    public String analizar() {
        return "Se analizo el registro de radar: " + super.getCodigo();
    }

}
