package edu.eci.arsw.transportari.model;

public class Ruta {
    private int idRuta;
    private String nombre;
    private String destino;
    private String origen;
    private String horario;
    private Servicio servicio;

    public Ruta(int idRuta, String nombre, String destino, String origen, String horario, Servicio servicio) {
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.destino = destino;
        this.origen = origen;
        this.horario = horario;
        this.servicio = servicio;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
