package com.example.examplerec;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    String[]arr;

    public MyAdapter(String[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.txt.setText(arr[position]);

    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;
        public Holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.img1);
            txt=(TextView)itemView.findViewById(R.id.t1);

            

        }


    }


}
