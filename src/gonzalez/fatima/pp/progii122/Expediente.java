
package gonzalez.fatima.pp.progii122;

import java.util.Objects;

public class Expediente {
    
    private final String codigo;
    private final String agenteSecreto;
    private final NivelSecreto nivelSecreto;
    

    public Expediente (String codigo, String agenteSecreto, NivelSecreto nivelSecreto) {
        this.codigo = codigo;
        this.agenteSecreto = agenteSecreto;
        this.nivelSecreto = nivelSecreto;
    }

    @Override
    public String toString() {
        String nombreSimple = getClass().getSimpleName();
        return nombreSimple
                + "[ codigo=" + codigo + ','
                + " agente=" + agenteSecreto + ','
                + " nivelSecreto=" + nivelSecreto + ',';      
    }
    
        @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Expediente e)) {
            return false;
        }
        return agenteSecreto.equals(e.agenteSecreto) 
                && codigo.equals(e.codigo);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        hash = 37 * hash + Objects.hashCode(this.agenteSecreto);
        return hash;
    }


    public NivelSecreto getNivelSecreto() {
        return nivelSecreto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAgenteSecreto() {
        return agenteSecreto;
    }
    
    
}
