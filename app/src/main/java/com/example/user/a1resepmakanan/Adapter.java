package com.example.user.a1resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 05/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {
    private Context context;
    private ArrayList<resep> array;

    public Adapter(Context context, ArrayList<resep> array) {
        this.context = context;
        this.array = array;
    }

    @Override
    public Adapter.AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listku,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.AdapterViewHolder holder, final int position) {
        holder.resep.setText(array.get(position).getJudul());
        holder.deskrip.setText(array.get(position).getDesk());
        holder.resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(context, DetailResep.class);
                obj.putExtra("lay2", array.get(position).getJudulbar());
                obj.putExtra("lay21", array.get(position).getImage());
                obj.putExtra("lay22", array.get(position).getDetailresep());
                context.startActivity(obj);
            }
        });

    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView resep;
        TextView deskrip;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            resep = (TextView) itemView.findViewById(R.id.resep);
            deskrip = (TextView) itemView.findViewById(R.id.desk);
        }
    };
}

