package com.example.parks3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parks3.R;
import com.example.parks3.model.PersonDummy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapterIndividualPark extends RecyclerView.Adapter<RecyclerViewAdapterIndividualPark.ViewHolder> {
    private ArrayList<PersonDummy> personDummyArrayList=new ArrayList<>();
    private int positionOfClickedImage;

    public RecyclerViewAdapterIndividualPark(ArrayList<PersonDummy> personDummyArrayList,int positionOfClickedImage) {
        this.personDummyArrayList=personDummyArrayList;
        this.positionOfClickedImage=positionOfClickedImage;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterIndividualPark.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.individual_park_recycler_view_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterIndividualPark.ViewHolder holder, int position) {

        Picasso.get().load(personDummyArrayList.get(0).getImages().get(4).getImageResource())
        .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return personDummyArrayList.get(positionOfClickedImage).getImages().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.recyclerViewAdapter_individualPark_recyclerViewRow_imageView);

        }
    }
}
