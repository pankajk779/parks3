package com.example.parks3.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parks3.R;
import com.example.parks3.model.Park;
import com.example.parks3.model.PersonDummy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapterExploreFavouriteParks extends RecyclerView.Adapter<RecyclerViewAdapterExploreFavouriteParks.ViewHolder>{

    List<Park> favouriteParks=new ArrayList<>();

    public RecyclerViewAdapterExploreFavouriteParks(List<Park>favouriteParks) {
        this.favouriteParks=favouriteParks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.favourite_parks_recyler_view_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.parkName.setText(favouriteParks.get(position).getName());
        holder.parkDesignation.setText(favouriteParks.get(position).getDesignation());
        holder.parkState.setText(favouriteParks.get(position).getStates());
        Log.d("MYTAG", "onBindViewHolder: "+favouriteParks.get(position));

        try {
            Picasso.get().load(favouriteParks.get(position).getImages().get(0).getUrl())
                    .into(holder.imageView);
        }catch(Exception e){
            Log.d("MYTAG", "onBindViewHolder: inside try/catch"+e.toString());
        }

    }

    @Override
    public int getItemCount() {
        return favouriteParks.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView; TextView parkName, parkDesignation, parkState;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView=itemView.findViewById(R.id.favouriteParksRecyclerViewRow_cardView);
            imageView=itemView.findViewById(R.id.imageView);
            parkName=itemView.findViewById(R.id.textView_parkName);
            parkDesignation=itemView.findViewById(R.id.textView_parkDesignation);
            parkState=itemView.findViewById(R.id.favouriteParks_recyclerViewRow_textView_parkState);

        }
    }
}
