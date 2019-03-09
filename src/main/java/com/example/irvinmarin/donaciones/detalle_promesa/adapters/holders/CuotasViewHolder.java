package com.example.irvinmarin.donaciones.detalle_promesa.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.detalle_promesa.entities.CuotaUI;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by irvinmarin on 28/02/2018.
 */

public class CuotasViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txtNroVoucher)
    TextView txtNroVoucher;
    @BindView(R.id.txtFechaInicio)
    TextView txtFechaInicio;
    @BindView(R.id.txtCampo)
    TextView txtCampo;
    @BindView(R.id.txtAbono)
    TextView txtAbono;

    public CuotasViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bind(CuotaUI cuotaUI, int position) {
        txtNroVoucher.setText(cuotaUI.getNroVoucher());
        txtFechaInicio.setText(cuotaUI.getFechaPago());
        txtCampo.setText(cuotaUI.getCampoMisionero());
        txtAbono.setText("S/ " + cuotaUI.getAbono());
    }
}
