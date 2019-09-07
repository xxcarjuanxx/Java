/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.entities;

import java.util.Date;

/**
 *
 * @author Juan Colonia
 */
public class Servicio {
    
    private int idServicio;
    private Date fecha; // la hora en que la micro llega
    private String recorrido; // ejem: f13, f26
    private String patente;
    private boolean sentido; // a que direccion va la micro
    private String despachar; //hora cuando la micro sale
    private String observacionServicio; // comentario del usuario que realiza la solicitud
    private String observacion; // administrador
    private String fechaObservacion; // administrador

    public Servicio() {
    }

    public Servicio(int idServicio, Date fecha, String recorrido, String patente, boolean sentido, String despachar, String observacionServicio, String observacion, String fechaObservacion) {
        this.idServicio = idServicio;
        this.fecha = fecha;
        this.recorrido = recorrido;
        this.patente = patente;
        this.sentido = sentido;
        this.despachar = despachar;
        this.observacionServicio = observacionServicio;
        this.observacion = observacion;
        this.fechaObservacion = fechaObservacion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isSentido() {
        return sentido;
    }

    public void setSentido(boolean sentido) {
        this.sentido = sentido;
    }

    public String getDespachar() {
        return despachar;
    }

    public void setDespachar(String despachar) {
        this.despachar = despachar;
    }

    public String getObservacionServicio() {
        return observacionServicio;
    }

    public void setObservacionServicio(String observacionServicio) {
        this.observacionServicio = observacionServicio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechaObservacion() {
        return fechaObservacion;
    }

    public void setFechaObservacion(String fechaObservacion) {
        this.fechaObservacion = fechaObservacion;
    }
    
    
    
    
    
    
}
