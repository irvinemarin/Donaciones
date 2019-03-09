package com.example.irvinmarin.donaciones.main.adapters.holders;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.detalle_promesa.DialogDetallePromesaFragment;
import com.example.irvinmarin.donaciones.main.enitiesUI.PromesaUI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by irvinmarin on 27/02/2018.
 */

public class PromesasViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtNroRegistro)
    TextView txtNroRegistro;
    @BindView(R.id.txtCodigoDonacion)
    TextView txtCodigoDonacion;
    @BindView(R.id.txtFechaInicio)
    TextView txtFechaInicio;
    @BindView(R.id.txtFechaFinal)
    TextView txtFechaFinal;
    @BindView(R.id.txtAbono)
    TextView txtAbono;
    @BindView(R.id.txtEstado)
    TextView txtEstado;


    public PromesasViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);

    }

    public void bind(final PromesaUI promesaUI) {


        txtNroRegistro.setText(promesaUI.getIdPromesa() + "");
        txtCodigoDonacion.setText("Codigo : " + promesaUI.getCodigo() + "");
        txtFechaInicio.setText("Inicio : " + getFechaDetalle(promesaUI.getFechaInicio()));
        txtFechaFinal.setText("Final : " + getFechaDetalle(promesaUI.getFechaFinal()));
        txtAbono.setText("S/ " + promesaUI.getTotalPromesa());
        txtEstado.setText(promesaUI.getEstado());

        if (promesaUI.getEstado().equals("Pendiente")) {
            txtEstado.setTextColor(Color.parseColor("#FFB30000"));
        }

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogDetallePromesaFragment fragment = DialogDetallePromesaFragment.newInstace(promesaUI, itemView.getContext());
                fragment.show(((Activity) v.getContext()).getFragmentManager(), "TAG");
            }
        });
    }

    private String getFechaDetalle(String fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        String dateInString = ;

        Date date = null;
        String formatterUIFinal = null;
        try {
            date = formatter.parse(fecha);
            SimpleDateFormat formatterUI = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
            formatterUIFinal = formatterUI.format(date);
            Log.d("", "date : " + formatter.format(date));
            return formatterUIFinal;
        } catch (ParseException e) {
//            e.printStackTrace();
            return "Fecha no Valida";
        }

    }


}
