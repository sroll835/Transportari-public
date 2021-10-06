package edu.eci.arsw.transportari.model;

public class Servicio {
    private int idServicio;
    private String tipoServicio;

    public Servicio(int idServicio, String tipoServicio) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
