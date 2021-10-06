package edu.eci.arsw.transportari.model;

public class Estacion {
    private String idEstacion;
    private String nombre;
    private Servicio servicio;

    public Estacion(String idEstacion, String nombre, Servicio servicio) {
        this.idEstacion = idEstacion;
        this.nombre = nombre;
        this.servicio = servicio;
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
