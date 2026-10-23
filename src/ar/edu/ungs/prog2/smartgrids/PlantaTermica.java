package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class PlantaTermica extends PlantaElectrica {

    private String tipoCombustible;
    private double objetivoCo2;
    private double capacidad;

    public PlantaTermica(
            String nombre,
            String direccion,
            double capacidadMaxima,
            LocalDateTime fechaPuesta,
            String tipoCombustible,
            double objetivoCo2,
            double capacidad) {

        super(nombre, direccion, capacidadMaxima, fechaPuesta);

        this.tipoCombustible = tipoCombustible;
        this.objetivoCo2 = objetivoCo2;
        this.capacidad = capacidad;
    }

    @Override
    public double capacidadMinimaCuota() {
        return capacidadMaxima / 2;
    }
}