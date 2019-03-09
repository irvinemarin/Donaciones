package com.example.irvinmarin.donaciones.detalle_promesa;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.detalle_promesa.adapters.CuotasAdapter;
import com.example.irvinmarin.donaciones.detalle_promesa.entities.CuotaUI;
import com.example.irvinmarin.donaciones.main.enitiesUI.PromesaUI;
import com.example.irvinmarin.donaciones.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by irvinmarin on 28/02/2018.
 */

public class DialogDetallePromesaFragment extends DialogFragment {

    public static PromesaUI promesaUI;
    @BindView(R.id.txtNroRegistro)
    TextView txtNroRegistro;
    @BindView(R.id.txtCantidadPromesa)
    TextView txtCantidadPromesa;
    @BindView(R.id.txtCodigoDonacion)
    TextView txtCodigoDonacion;
    @BindView(R.id.txtFechaInicio)
    TextView txtFechaInicio;
    @BindView(R.id.txtFechaFinal)
    TextView txtFechaFinal;
    @BindView(R.id.txtNroCuotas)
    TextView txtNroCuotas;
    @BindView(R.id.txtAbono)
    TextView txtAbono;
    @BindView(R.id.txtRestante)
    TextView txtRestante;
    @BindView(R.id.txtFrecuencia)
    TextView txtFrecuencia;
    @BindView(R.id.txtNombreProyecto)
    TextView txtNombreProyecto;
    @BindView(R.id.txtEstado)
    TextView txtEstado;
    Unbinder unbinder;
    @BindView(R.id.rv_ListaCuotas)
    RecyclerView rvListaCuotas;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.txtCantidadTotal)
    TextView txtCantidadTotal;

    public static DialogDetallePromesaFragment newInstace(PromesaUI promesaUI, Context context) {
        DialogDetallePromesaFragment.promesaUI = promesaUI;
        return new DialogDetallePromesaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_detalle_promesa, container, false);
        unbinder = ButterKnife.bind(this, view);


        setupRvCuotas();
        setupData();
        return view;
    }

    private void setupRvCuotas() {

        rvListaCuotas.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvListaCuotas.setAdapter(new CuotasAdapter(getCutoas()));
    }

    double totalCuota = 0;

    private List<CuotaUI> getCutoas() {
        List<CuotaUI> cuotaUIList = new ArrayList<>();
        cuotaUIList.add(new CuotaUI(0, "asdfadfgaed", "01/05/2018", "Lima", 100));
        cuotaUIList.add(new CuotaUI(0, "adbfadjfgda", "01/06/2018", "Lima", 100));
        cuotaUIList.add(new CuotaUI(0, "fhjrtyrtyud", "01/07/2018", "Lima", 100));
        cuotaUIList.add(new CuotaUI(0, "dgnfyuryudg", "01/08/2018", "Lima", 100));


        for (CuotaUI cuotaUI : cuotaUIList) {
            totalCuota = totalCuota + cuotaUI.getAbono();
        }

        return cuotaUIList;
    }

    private void setupData() {
        txtCodigoDonacion.setText(promesaUI.getCodigo() + "");
        txtFechaInicio.setText("Inicio : " + Utils.getFechaDetalle(promesaUI.getFechaInicio()));
        txtFechaFinal.setText("Fin :" + Utils.getFechaDetalle(promesaUI.getFechaFinal()));
        txtNroRegistro.setText(promesaUI.getIdPromesa() + "");
        txtCantidadTotal.setText("S/ " + totalCuota);
        txtCantidadPromesa.setText("Cantidad Promesa S/ " + promesaUI.getTotalPromesa());
//        txtNroCuotas.setText(promesaUI.getCodigo());
//        txtAbono.setText(promesaUI.getCodigo());
//        txtNroCuotas.setText(promesaUI.getCodigo());
//        txtRestante.setText(promesaUI.getCodigo());
//        txtFrecuencia.setText(promesaUI.getCodigo());
//        txtNombreProyecto.setText(promesaUI.getCodigo());
        txtEstado.setText(promesaUI.getEstado());

        switch (promesaUI.getEstadoId()) {
            case 1:
                txtEstado.setTextColor(Color.parseColor("#58de71"));
                txtEstado.setBackground(getResources().getDrawable(R.drawable.background_border_green));
                break;
            case 2:
                txtEstado.setBackground(getResources().getDrawable(R.drawable.background_border_red));
                txtEstado.setTextColor(Color.parseColor("#ff0000"));

                break;
        }

    }

    @Override
    public void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        }
        super.onStart();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
