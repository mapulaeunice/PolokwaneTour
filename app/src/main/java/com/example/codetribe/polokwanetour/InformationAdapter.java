package com.example.codetribe.polokwanetour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by codetribe on 8/4/2017.
 */

public class InformationAdapter extends RecyclerView.Adapter<InformationAdapter.ViewHolder>
{
    private List<Information> informations;
    private Context context;

    public InformationAdapter(Context context,List<Information> information) {
        this.context = context;
        this.informations = information;

    }

    @Override
    public InformationAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

       final Information info = informations.get(i);

        viewHolder.tv_hotel.setText(informations.get(i).getName());
        Log.i("Ygritte",informations.get(i).getUrl());

        Picasso.with(context).load(informations.get(i).getUrl()).resize(120, 60).into(viewHolder.img);

        viewHolder.cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,Hotels.class);
                intent.putExtra("info",info);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return informations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_hotel;
        ImageView img;

        CardView cd;

        public ViewHolder(View view) {
            super(view);

            tv_hotel = (TextView)view.findViewById(R.id.tv_android);
            img = (ImageView)view.findViewById(R.id.img_android);
            cd =(CardView)view.findViewById(R.id.card);
        }
    }
}
