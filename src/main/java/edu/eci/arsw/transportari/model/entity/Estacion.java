package edu.eci.arsw.transportari.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estaciones")
public class Estacion {
    private double X;
    private double Y;
    private int objectid;
    private String numero_estacion;
    private String nombre_estacion;
    private double coordenada_x_estacion;
    private double coordenada_y_estacion;
    private String ubicacion_estacion;
    private String troncal_estacion;
    private int numero_vagones_estacion;
    private int numero_accesos_estacion;
    private int biciestacion_estacion;
    private int capacidad_biciestacion_estacion;
    private int tipo_estacion;
    private int biciparqueadero_estacion;
    private double latitud_estacion;
    private double longitud_estacion;
    private String globalid;
    private String last_edited_user;
    private String last_edited_date;
    private String codigo_nodo_estacion;

    public Estacion(double X;double y;
            int objectid;
            String numero_estacion;
            String nombre_estacion;
            double coordenada_x_estacion;
            double coordenada_y_estacion;
            String ubicacion_estacion;
            String troncal_estacion;
            int numero_vagones_estacion;
            int numero_accesos_estacion;
            int biciestacion_estacion;
            int capacidad_biciestacion_estacion;
            int tipo_estacion;
            int biciparqueadero_estacion;
            double latitud_estacion;
            double longitud_estacion;
            String globalid;
            String last_edited_user;
            String last_edited_date;
            String codigo_nodo_estacion) {

    }

}
