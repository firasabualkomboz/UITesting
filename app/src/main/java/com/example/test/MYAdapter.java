package com.example.test;

import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MYAdapter extends RecyclerView.Adapter {
    ArrayList<String> datas;
    Context context;

    public MYAdapter(ArrayList<String> datas, Context Context) {
        this.datas = datas;
        this.context = Context;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        String s= datas.get(position);
        vh.tv.setText(s);

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class VH extends RecyclerView.ViewHolder {

        TextView tv;

        public VH(@NonNull View itemView) {
            super(itemView);

            tv=itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position= getAdapterPosition();
                    Toast.makeText(context, position+""+ datas.get(position),Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycle_item, viewGroup, false);

        return new VH(v);
    }
}


