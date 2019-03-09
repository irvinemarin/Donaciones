package com.example.irvinmarin.donaciones.detalle_promesa.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.detalle_promesa.adapters.holders.CuotasViewHolder;
import com.example.irvinmarin.donaciones.detalle_promesa.entities.CuotaUI;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by irvinmarin on 28/02/2018.
 */

public class CuotasAdapter extends RecyclerView.Adapter<CuotasViewHolder> {
    List<CuotaUI> cuotaUIList;

    public CuotasAdapter(List<CuotaUI> cuotaUIList) {
        this.cuotaUIList = cuotaUIList;
    }

    @Override
    public CuotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cuotas, parent, false);

        return new CuotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CuotasViewHolder holder, int position) {
        holder.bind(cuotaUIList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return cuotaUIList.size();
    }


}
