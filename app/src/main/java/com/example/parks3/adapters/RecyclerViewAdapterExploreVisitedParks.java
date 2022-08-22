package com.example.parks3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parks3.OnMyItemClickListener;
import com.example.parks3.R;
import com.example.parks3.model.PersonDummy;

import java.util.ArrayList;

public class RecyclerViewAdapterExploreVisitedParks extends RecyclerView.Adapter<RecyclerViewAdapterExploreVisitedParks.ViewHolder> {
    private ArrayList<PersonDummy> personDummyArrayList=new ArrayList<>();
    private OnMyItemClickListener onMyItemClickListener;

    public RecyclerViewAdapterExploreVisitedParks() {
        this.personDummyArrayList=personDummyArrayList;
        this.onMyItemClickListener=onMyItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterExploreVisitedParks.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.explore_visited_parks_recycler_view_row,parent,false);

        return new ViewHolder(view, onMyItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterExploreVisitedParks.ViewHolder holder, int position) {
//        holder.originalName.setText(personDummyArrayList.get(position).getOriginalName());
//        Picasso.get().load(personDummyArrayList.get(position).getImages().get(0).getImageResource())
//                .into(holder.exploreImageViewRecyclerViewVisitedParks);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView exploreImageViewRecyclerViewVisitedParks;
        TextView originalName, characterName;
        OnMyItemClickListener onMyItemClickListener;

        public ViewHolder(@NonNull View itemView, OnMyItemClickListener onMyItemClickListener) {
            super(itemView);
            this.onMyItemClickListener=onMyItemClickListener;
            exploreImageViewRecyclerViewVisitedParks=itemView.findViewById(R.id.explore_imageView_recyclerView_row_visitedParks);
            originalName=itemView.findViewById(R.id.explore_textView_recyclerView_row_visitedParks_parkName);
            characterName=itemView.findViewById(R.id.explore_textView_recyclerView_row_visitedParks_parkDesignation);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onMyItemClickListener.onItemClick(view, getAdapterPosition());
                }
            });

        }


    }
}



