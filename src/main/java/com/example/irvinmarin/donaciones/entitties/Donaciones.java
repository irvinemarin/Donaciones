package com.example.irvinmarin.donaciones.entitties;

import com.example.irvinmarin.donaciones.lib.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by irvinmarin on 28/02/2018.
 */

@Table(database = AppDatabase.class)
public class Donaciones extends BaseModel {

    @PrimaryKey
    private int idPromesa;
    @Column
    private int codDonacion;
    @Column
    private double cantidad;
    @Column
    private int nroCuota;
    @Column
    private double abono;
    @Column
    private double restante;
    @Column
    private String frecuencia;
    @Column
    private String fechaInicio;
    @Column
    private String fechaFinal;
    @Column
    private String modalidad;
    @Column
    private int idDonante;
    @Column
    private int idProyecto;
    @Column
    private int idEstado;
    @Column
    private String estado;
    @Column
    private String created_at;
    @Column
    private String updated_at;

    public Donaciones() {
    }

    public Donaciones(int idPromesa, int codDonacion, double cantidad, int nroCuota, double abono, double restante, String frecuencia, String fechaInicio, String fechaFinal, String modalidad, int idDonante, int idProyecto, int idEstado, String estado, String created_at, String updated_at) {
        this.idPromesa = idPromesa;
        this.codDonacion = codDonacion;
        this.cantidad = cantidad;
        this.nroCuota = nroCuota;
        this.abono = abono;
        this.restante = restante;
        this.frecuencia = frecuencia;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.modalidad = modalidad;
        this.idDonante = idDonante;
        this.idProyecto = idProyecto;
        this.idEstado = idEstado;
        this.estado = estado;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getIdPromesa() {
        return idPromesa;
    }

    public void setIdPromesa(int idPromesa) {
        this.idPromesa = idPromesa;
    }

    public int getCodDonacion() {
        return codDonacion;
    }

    public void setCodDonacion(int codDonacion) {
        this.codDonacion = codDonacion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getRestante() {
        return restante;
    }

    public void setRestante(double restante) {
        this.restante = restante;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getIdDonante() {
        return idDonante;
    }

    public void setIdDonante(int idDonante) {
        this.idDonante = idDonante;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
