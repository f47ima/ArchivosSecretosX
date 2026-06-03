
package gonzalez.fatima.pp.progii122;


public class TestimonioClasificado extends Expediente implements Reportables{
    private final String claveTestigo;

    public TestimonioClasificado(String codigo, String agenteSecreto, NivelSecreto nivelSecreto,String claveTestigo ) {
        super(codigo, agenteSecreto, nivelSecreto);
        this.claveTestigo = claveTestigo;
    }


    @Override
    public String reportar() {
        return "Reporte de testimonio clasificado : "+  super.getCodigo() + " Nombre clave del testigo: " + claveTestigo+ ".";
    }
        @Override
    public String toString() {
        return super.toString() + " nombreClaveTestigo=" + claveTestigo + ']';
    }
    
}
