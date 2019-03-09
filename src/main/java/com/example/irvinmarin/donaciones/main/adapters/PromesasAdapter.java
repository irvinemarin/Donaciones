package com.example.irvinmarin.donaciones.main.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.main.adapters.holders.PromesasViewHolder;
import com.example.irvinmarin.donaciones.main.enitiesUI.PromesaUI;

import java.util.List;

import butterknife.BindView;

/**
 * Created by irvinmarin on 27/02/2018.
 */

public class PromesasAdapter extends RecyclerView.Adapter<PromesasViewHolder> {


    private List<PromesaUI> promesaUIList;

    public PromesasAdapter(List<PromesaUI> promesaUIList) {
        this.promesaUIList = promesaUIList;
    }

    @Override
    public PromesasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promesa, parent, false);
        return new PromesasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PromesasViewHolder holder, int position) {
        holder.bind(promesaUIList.get(position));
    }


    @Override
    public int getItemCount() {
        return promesaUIList.size();
    }
}
