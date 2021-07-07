package com.tahir70108.carshowroom;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder>{

    ArrayList<Car> carList;


    OnItemSelected activity;

    public interface  OnItemSelected{
        void onItemSelected(int index);
    }



    public CarAdapter (Context context, ArrayList<Car> carArrayList){
            this.activity= (OnItemSelected) context;
            this.carList=carArrayList;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivLogoList;
        TextView tvModelList;
        TextView tvOwnerList;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            ivLogoList = itemView.findViewById(R.id.ivcarlogolist);
            tvModelList = itemView.findViewById(R.id.tvModelList);
            tvModelList = itemView.findViewById(R.id.tvOwnerList);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemSelected(carList.indexOf(v.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(carList.get(position));
        holder.tvModelList.setText(carList.get(position).getModel());
        holder.tvOwnerList.setText(carList.get(position).getOwner());
        holder.ivLogoList.setImageResource(R.drawable.audi);

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
