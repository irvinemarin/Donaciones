package com.example.irvinmarin.donaciones.main.enitiesUI;

/**
 * Created by irvinmarin on 27/02/2018.
 */

public class PromesaUI {

    private int idPromesa;
    private int codigo;
    private String fechaInicio;
    private String fechaFinal;
    private String estado;
    private int estadoId;
    private double totalPromesa;

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public PromesaUI() {
    }

    public PromesaUI(int idPromesa, int codigo, String fechaInicio, String fechaFinal, String estado, int estadoId, double totalPromesa) {
        this.idPromesa = idPromesa;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.estadoId = estadoId;
        this.totalPromesa = totalPromesa;
    }

    public int getIdPromesa() {
        return idPromesa;
    }

    public void setIdPromesa(int idPromesa) {
        this.idPromesa = idPromesa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotalPromesa() {
        return totalPromesa;
    }

    public void setTotalPromesa(double totalPromesa) {
        this.totalPromesa = totalPromesa;
    }
}
