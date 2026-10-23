package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class PlantaEolica extends PlantaRenovable {

    private int cantidadAerogeneradores;
    private double alturaTorres;
    private double velocidadMin;

    public PlantaEolica(
            String nombre,
            String direccion,
            double capacidadMaxima,
            LocalDateTime fechaPuesta,
            String fuentePrimaria,
            double eficienciaPromedio,
            int cantidadAerogeneradores,
            double alturaTorres,
            double velocidadMin) {

        super(nombre, direccion, capacidadMaxima, fechaPuesta,
                fuentePrimaria, eficienciaPromedio);

        this.cantidadAerogeneradores = cantidadAerogeneradores;
        this.alturaTorres = alturaTorres;
        this.velocidadMin = velocidadMin;
    }

    @Override
    public double capacidadMinimaCuota() {
        return capacidadMaxima * eficienciaPromedio;
    }
}