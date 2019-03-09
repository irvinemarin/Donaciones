package com.example.irvinmarin.donaciones.detalle_promesa.entities;

/**
 * Created by irvinmarin on 28/02/2018.
 */

public class CuotaUI {
    private int idCouta;
    private String nroVoucher;
    private String fechaPago;
    private String campoMisionero;
    private double abono;

    public CuotaUI() {
    }

    public CuotaUI(int idCouta, String nroVoucher, String fechaPago, String campoMisionero, double abono) {
        this.idCouta = idCouta;
        this.nroVoucher = nroVoucher;
        this.fechaPago = fechaPago;
        this.campoMisionero = campoMisionero;
        this.abono = abono;
    }

    public int getIdCouta() {
        return idCouta;
    }

    public void setIdCouta(int idCouta) {
        this.idCouta = idCouta;
    }

    public String getNroVoucher() {
        return nroVoucher;
    }

    public void setNroVoucher(String nroVoucher) {
        this.nroVoucher = nroVoucher;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getCampoMisionero() {
        return campoMisionero;
    }

    public void setCampoMisionero(String campoMisionero) {
        this.campoMisionero = campoMisionero;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }
}
