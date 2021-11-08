package edu.eci.arsw.transportari.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rutas")
public class Ruta {
    private int idRuta;
    private String nombre;
    private String destino;
    private int posicion;
    private String parada;
    private String servicio;
    private String estacion;

    public Ruta(int idRuta,String nombre,String destino,int posicion,String parada,String servicio,String estacion) {
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.destino = destino;
        this.posicion = posicion;
        this.parada = parada;
        this.servicio = servicio;
        this.estacion = estacion;
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

    public String getServicio() { return servicio;}

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
