package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public abstract class PlantaElectrica {

    protected String nombre;
    protected String direccion;
    protected double capacidadMaxima;
    protected LocalDateTime fechaPuesta;
    protected boolean activa;

    public PlantaElectrica(
            String nombre,
            String direccion,
            double capacidadMaxima,
            LocalDateTime fechaPuesta) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
        this.fechaPuesta = fechaPuesta;
        this.activa = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public LocalDateTime getFechaPuesta() {
        return fechaPuesta;
    }

    public boolean isActiva() {
        return activa;
    }

    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public abstract double capacidadMinimaCuota();
}