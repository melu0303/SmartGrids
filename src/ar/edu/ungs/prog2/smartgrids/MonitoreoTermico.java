package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class MonitoreoTermico extends Monitoreo {

    private double co2Emitido;
    private double cantidadCombustible;

    public MonitoreoTermico(
            LocalDateTime fechaHora,
            double energiaGenerada,
            int incidencias,
            double co2Emitido,
            double cantidadCombustible) {

        super(fechaHora, energiaGenerada, incidencias);

        this.co2Emitido = co2Emitido;
        this.cantidadCombustible = cantidadCombustible;
    }

    public double getCo2Emitido() {
        return co2Emitido;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }
}