
package gonzalez.fatima.pp.progii122;


public abstract class ExpedientesAnalizables extends Expediente implements Analizables {
    
    public ExpedientesAnalizables(String codigo, String agenteSecreto, NivelSecreto nivelSecreto) {
        super(codigo, agenteSecreto, nivelSecreto);
    }
    
    @Override
    public String analizar(){
        String[] partes = getClass().getSimpleName().split("(?=[A-Z])");
        String nombre = String.join(" ", partes).toLowerCase();
        return "Se analizo el " + nombre + ": " + super.getCodigo();
    }
    
}
