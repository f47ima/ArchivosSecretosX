package gonzalez.fatima.pp.progii122;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExpedientesSecretos {

    private final List<Expediente> expedientes;
    private final String nombre;

    public ExpedientesSecretos(String nombre) {
        this.nombre = nombre;
        expedientes = new ArrayList<>();
    }

    public void agregarExpediente(Expediente expediente) {
        Objects.requireNonNull(expediente, "Expediente Nulo");
        if (expedientes.contains(expediente)) {
            throw new ExpedienteDuplicadoException("No se pudo agregar el expediente: Ya existe un expediente con codigo '"
                    + expediente.getCodigo() + "' y agente '" + expediente.getAgenteSecreto() + "'.");
        }
        expedientes.add(expediente);
    }

    public ArrayList<Expediente> obtenerExpedientes() {
        return new ArrayList<>(expedientes);
    }

    public List<Expediente> filtrarPorNivel(NivelSecreto nivelSecreto) {
        List<Expediente> privacidadExpedientes = new ArrayList<>();
        for (Expediente e : expedientes) {
            if (e.getNivelSecreto() == nivelSecreto) {
                privacidadExpedientes.add(e);
            }
        }
        if (privacidadExpedientes.isEmpty()) {
            throw new IllegalStateException("No hay Expedientes de esta privacidad.");
        }
        return privacidadExpedientes;
    }

}
